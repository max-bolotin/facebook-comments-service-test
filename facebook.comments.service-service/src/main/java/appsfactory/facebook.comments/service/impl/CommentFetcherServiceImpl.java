package appsfactory.facebook.comments.service.impl;


import appsfactory.facebook.comments.domain.comment.CommentData;
import appsfactory.facebook.comments.repository.entity.CommentEntity;
import appsfactory.facebook.comments.service.CommentFetcherService;
import appsfactory.facebook.comments.service.HttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CommentFetcherServiceImpl implements CommentFetcherService {
  private final HttpClient httpClient;
//  private final CommentRepository commentRepository;


  @Override
  public CommentData fetchComments(String postId) {
    String url = "https://edit.pp.ua/jsnexmpl/incoming-comments.json";
    CommentData commentData = httpClient.get(url, CommentData.class);

    save(commentData);
    return commentData;
  }

  @Override
  public CommentEntity save(CommentData commentData) {
//    return commentRepository.save(commentMapper.mapToComment(commentList));
    return null;
  }
}
