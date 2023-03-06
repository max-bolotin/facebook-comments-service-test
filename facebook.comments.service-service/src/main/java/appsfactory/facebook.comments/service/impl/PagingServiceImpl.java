package appsfactory.facebook.comments.service.impl;

import appsfactory.facebook.comments.repository.entity.PagingEntity;
import appsfactory.facebook.comments.repository.PagingRepository;
import appsfactory.facebook.comments.service.PagingService;

public class PagingServiceImpl implements PagingService {
  private final PagingRepository pagingRepository;

  public PagingServiceImpl(PagingRepository pagingRepository) {
    this.pagingRepository = pagingRepository;
  }

  @Override
  public PagingEntity findById(Long id) {
    return pagingRepository.findById(id).orElseThrow(
        () -> new RuntimeException(String.format("Paging with id %s not found", id)));
  }
}
