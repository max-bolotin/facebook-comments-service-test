package appsfactory.facebook.comments.repository.factory.impl;

import appsfactory.facebook.comments.domain.paging.Paging;
import appsfactory.facebook.comments.repository.entity.PagingEntity;
import appsfactory.facebook.comments.repository.factory.ModelFactory;
import org.springframework.stereotype.Component;

@Component("PagingFactoryImpl")
public class PagingFactoryImpl implements ModelFactory<PagingEntity, Paging> {
  @Override
  public PagingEntity toEntity(Paging paging) {
    return PagingEntity.builder()
        .build();
  }

  @Override
  public Paging toModel(PagingEntity pagingEntity) {
    return Paging.builder()
//        .id(pagingEntity.getId())
        .build();
  }
}
