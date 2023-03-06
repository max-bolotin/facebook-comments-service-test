package appsfactory.facebook.comments.service;

import appsfactory.facebook.comments.repository.entity.LikeEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface LikeService {
  LikeEntity findById(Long id);

  List<LikeEntity> findAllById(List<Long> likeIds);
}
