package appsfactory.facebook.comments.repository.factory.impl;

import appsfactory.facebook.comments.domain.comment.Like;
import appsfactory.facebook.comments.repository.entity.LikeEntity;
import appsfactory.facebook.comments.repository.factory.ModelFactory;

public class LikeDataFactoryImpl implements ModelFactory<LikeEntity, Like> {

  @Override
  public LikeEntity toEntity(Like model) {
    return null;
  }

  @Override
  public Like toModel(LikeEntity entity) {
    return null;
  }
}
