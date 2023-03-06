package appsfactory.facebook.comments.repository.factory.impl;

import appsfactory.facebook.comments.domain.paging.Cursor;
import appsfactory.facebook.comments.repository.entity.CursorEntity;
import appsfactory.facebook.comments.repository.factory.ModelFactory;

public class CursorFactoryImpl implements ModelFactory<CursorEntity, Cursor> {

  @Override
  public CursorEntity toEntity(Cursor model) {
    return null;
  }

  @Override
  public Cursor toModel(CursorEntity entity) {
    return null;
  }
}
