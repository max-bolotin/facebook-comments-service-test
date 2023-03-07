package appsfactory.facebook.comments.repository.factory.impl;


import appsfactory.facebook.comments.domain.comment.LikedUser;
import appsfactory.facebook.comments.repository.entity.LikedUserEntity;
import appsfactory.facebook.comments.repository.factory.ModelFactory;
import org.springframework.stereotype.Component;

@Component("LikeFactoryImpl")
public class LikeFactoryImpl implements ModelFactory<LikedUserEntity, LikedUser> {

  @Override
  public LikedUserEntity toEntity(LikedUser likedUser) {
    return LikedUserEntity.builder()
        .build();
  }

  @Override
  public LikedUser toModel(LikedUserEntity likedUserEntity) {
    return LikedUser.builder().build();
  }
}