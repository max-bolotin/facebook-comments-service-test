package appsfactory.facebook.comments.service.impl;


import appsfactory.facebook.comments.domain.Comment;
import appsfactory.facebook.comments.domain.comment.CommentData;
import appsfactory.facebook.comments.repository.converter.CommentConverter;
import appsfactory.facebook.comments.repository.entity.CommentEntity;
import appsfactory.facebook.comments.repository.CommentRepository;
import appsfactory.facebook.comments.repository.factory.ModelFactory;
import appsfactory.facebook.comments.service.CommentFetcherService;
import appsfactory.facebook.comments.service.HttpClient;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentFetcherServiceImpl implements CommentFetcherService {
  private static final String URL = "https://edit.pp.ua/jsnexmpl/incoming-comments.json";
  private final HttpClient httpClient;
  private final CommentConverter commentConverter;
  @Qualifier(value = "CommentFactoryImpl")
  private final ModelFactory<CommentEntity, Comment> commentFactory;
  private final CommentRepository commentRepository;

  public CommentFetcherServiceImpl(HttpClient httpClient,
      CommentConverter commentConverter, ModelFactory<CommentEntity, Comment> commentFactory,
      CommentRepository commentRepository) {
    this.httpClient = httpClient;
    this.commentConverter = commentConverter;
    this.commentFactory = commentFactory;
    this.commentRepository = commentRepository;
  }


  @Override
  public CommentData fetchComments(String postId) {


    CommentData data = parseJsonWithGson(URL);

    CommentData commentData = httpClient.get(URL, CommentData.class);

    System.out.println("ObjectMapper: " + commentData.toString());

    List<Comment> comments = commentData.getData();
    for (Comment comment : comments) {
      System.out.println(comment.toString());
      save(comment);
    }
    return commentData;
  }

  private static CommentData parseJsonWithGson(String url) {
    URL jsonUrl = null;
    try {
      jsonUrl = new URL(url);
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
    Gson gson = new Gson();
    try {
      InputStreamReader reader = new InputStreamReader(jsonUrl.openStream());
      CommentData data = gson.fromJson(reader, CommentData.class);
      System.out.println("Gson: " + data);
    return data;
    } catch (IOException e) {
      throw new RuntimeException("Cannot parse JSON with Gson! ", e);
    }
  }

  @Override
  public CommentEntity save(Comment comment) {
    CommentEntity commentEntity = commentConverter.convert(comment);
    System.out.println(commentEntity.getMessage());
    return commentRepository.save(commentEntity);
  }
}
