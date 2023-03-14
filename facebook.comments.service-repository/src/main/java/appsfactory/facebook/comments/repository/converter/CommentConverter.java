package appsfactory.facebook.comments.repository.converter;

import appsfactory.facebook.comments.domain.Comment;
import appsfactory.facebook.comments.repository.entity.CommentEntity;
import java.time.LocalDateTime;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CommentConverter implements Converter<Comment, CommentEntity> {

  @Override
  public CommentEntity convert(Comment comment) {
    return CommentEntity.builder()
        .commentId(comment.getId())
        .message(comment.getMessage())
//        .user(userService.findById(comment.getFrom().getUserId()))
//        .createdTime(LocalDateTime.parse(comment.getCreated_time()))
//        .likes(likeService.findAllById(comment.getLikes()))
        .build();
  }
}
