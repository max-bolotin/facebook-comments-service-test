package appsfactory.facebook.comments.repository.factory.impl;


import appsfactory.facebook.comments.domain.comment.Like;
import appsfactory.facebook.comments.repository.entity.LikeEntity;
import appsfactory.facebook.comments.repository.factory.ModelFactory;
import appsfactory.facebook.comments.service.UserService;
import org.springframework.stereotype.Component;

@Component("LikeFactoryImpl")
public class LikeFactoryImpl implements ModelFactory<LikeEntity, Like> {
  private final UserService userService;

  public LikeFactoryImpl(UserService userService) {
    this.userService = userService;
  }

  @Override
  public LikeEntity toEntity(Like like) {
    return LikeEntity.builder()
        .build();
  }

  @Override
  public Like toModel(LikeEntity likeEntity) {
    return Like.builder().build();
  }
}