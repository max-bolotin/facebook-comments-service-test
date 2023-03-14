package appsfactory.facebook.comments.repository.factory.impl;

import appsfactory.facebook.comments.domain.Comment;
import appsfactory.facebook.comments.repository.entity.CommentEntity;
import appsfactory.facebook.comments.repository.factory.ModelFactory;
import appsfactory.facebook.comments.service.UserService;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component("CommentFactoryImpl")
public class CommentFactoryImpl implements ModelFactory<CommentEntity, Comment> {
  private final UserService userService;

  public CommentFactoryImpl(UserService userService) {
    this.userService = userService;
  }

  @Override
  public CommentEntity toEntity(Comment comment) {
    return CommentEntity.builder()
        .commentId(comment.getId())
        .message(comment.getMessage())
//        .user(userService.findById(comment.getFrom().getUserId()))
        .createdTime(LocalDateTime.parse(comment.getCreated_time()))
//        .likes(likeService.findAllById(comment.getLikes()))
        .build();
  }

  @Override
  public Comment toModel(CommentEntity commentEntity) {
    return Comment.builder()
//        .id(commentEntity.getId())
        .id(commentEntity.getCommentId())
        .message(commentEntity.getMessage())
//        .from(commentEntity.getUser().getId())
//        .created_time(String.valueOf(commentEntity.getCreatedTime()))
/*        .likes(commentEntity
            .getLikes()
            .stream()
            .map(LikeEntity::getId)
            .toList())*/
        .build();
  }
}
