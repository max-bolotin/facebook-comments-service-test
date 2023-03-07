package appsfactory.facebook.comments.service;


import appsfactory.facebook.comments.domain.Comment;
import appsfactory.facebook.comments.domain.comment.CommentData;
import appsfactory.facebook.comments.repository.entity.CommentEntity;

public interface CommentFetcherService {
  CommentData fetchComments(String postId);
  CommentEntity save(Comment comment);


}
