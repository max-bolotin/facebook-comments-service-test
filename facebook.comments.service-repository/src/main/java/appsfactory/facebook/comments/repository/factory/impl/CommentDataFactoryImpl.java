package appsfactory.facebook.comments.repository.factory.impl;

import appsfactory.facebook.comments.domain.comment.CommentData;
import appsfactory.facebook.comments.repository.entity.CommentDataEntity;
import appsfactory.facebook.comments.repository.factory.ModelFactory;

public class CommentDataFactoryImpl implements ModelFactory<CommentDataEntity, CommentData> {

  @Override
  public CommentDataEntity toEntity(CommentData model) {
    return null;
  }

  @Override
  public CommentData toModel(CommentDataEntity entity) {
    return null;
  }
}
