package appsfactory.facebook.comments.repository.converter;

import appsfactory.facebook.comments.domain.comment.CommentData;
import appsfactory.facebook.comments.repository.entity.CommentDataEntity;
import org.springframework.core.convert.converter.Converter;

public class CommentDataConverter implements Converter<CommentData, CommentDataEntity> {

  @Override
  public CommentDataEntity convert(CommentData commentData) {
    return CommentDataEntity.builder().build();
  }
}
