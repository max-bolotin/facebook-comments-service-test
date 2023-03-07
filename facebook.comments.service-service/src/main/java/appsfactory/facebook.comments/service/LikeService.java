package appsfactory.facebook.comments.service;

import appsfactory.facebook.comments.repository.entity.LikedUserEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface LikeService {
  LikedUserEntity findById(Long id);

  List<LikedUserEntity> findAllById(List<Long> likeIds);
}
