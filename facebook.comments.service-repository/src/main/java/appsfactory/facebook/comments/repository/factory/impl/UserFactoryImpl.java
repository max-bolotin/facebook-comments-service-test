package appsfactory.facebook.comments.repository.factory.impl;

import appsfactory.facebook.comments.domain.comment.User;
import appsfactory.facebook.comments.repository.entity.UserEntity;
import appsfactory.facebook.comments.repository.factory.ModelFactory;
import org.springframework.stereotype.Component;

@Component("UserFactoryImpl")
public class UserFactoryImpl implements ModelFactory<UserEntity, User> {

  @Override
  public UserEntity toEntity(User user) {
    return UserEntity.builder()
        .userId(user.getId())
        .name(user.getName())
        .build();
  }

  @Override
  public User toModel(UserEntity userEntity) {
    return User.builder()
        .id(userEntity.getUserId())
        .name(userEntity.getName())
        .build();
  }
}
