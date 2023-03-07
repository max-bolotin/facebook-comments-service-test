package appsfactory.facebook.comments.service.impl;


import appsfactory.facebook.comments.domain.Comment;
import appsfactory.facebook.comments.domain.comment.CommentData;
//import appsfactory.facebook.comments.repository.CommentRepository;
import appsfactory.facebook.comments.repository.entity.CommentEntity;
import appsfactory.facebook.comments.repository.factory.ModelFactory;
import appsfactory.facebook.comments.service.CommentFetcherService;
import appsfactory.facebook.comments.service.HttpClient;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@RequiredArgsConstructor
@Service
public class CommentFetcherServiceImpl implements CommentFetcherService {
  private final HttpClient httpClient;
/*  private final CommentRepository commentRepository;
  @Qualifier(value = "CommentFactoryImpl")
  private final ModelFactory<CommentEntity, Comment> commentFactory;*/

  public CommentFetcherServiceImpl(HttpClient httpClient/*, CommentRepository commentRepository,
      ModelFactory<CommentEntity, Comment> commentFactory*/) {
    this.httpClient = httpClient;
/*    this.commentRepository = commentRepository;
    this.commentFactory = commentFactory;*/
  }


  @Override
  public CommentData fetchComments(String postId) {
    String url = "https://edit.pp.ua/jsnexmpl/incoming-comments.json";
    CommentData commentData = httpClient.get(url, CommentData.class);

    System.out.println("ObjectMapper: " + commentData.toString());

    List<Comment> comments = commentData.getData();
    for (Comment comment : comments) {
      System.out.println(comment.toString());
      save(comment);
    }
    return commentData;
  }

  @Override
  public CommentEntity save(Comment comment) {
//    return commentRepository.save(commentFactory.toEntity(comment));
    return null;
  }
}
