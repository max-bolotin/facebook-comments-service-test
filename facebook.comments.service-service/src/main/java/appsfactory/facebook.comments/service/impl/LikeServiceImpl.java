package appsfactory.facebook.comments.service.impl;

import appsfactory.facebook.comments.repository.entity.LikeEntity;
import appsfactory.facebook.comments.repository.LikeRepository;
import appsfactory.facebook.comments.service.LikeService;
import java.util.List;

public class LikeServiceImpl implements LikeService {
  private final LikeRepository likeRepository;

  public LikeServiceImpl(LikeRepository likeRepository) {
    this.likeRepository = likeRepository;
  }

  @Override
  public LikeEntity findById(Long id) {
    return likeRepository.findById(id).orElseThrow(
        () -> new RuntimeException(String.format("Like with id %s not found", id)));
  }

  @Override
  public List<LikeEntity> findAllById(List<Long> likeIds) {
    return likeRepository.findAllById(likeIds);
  }
}
