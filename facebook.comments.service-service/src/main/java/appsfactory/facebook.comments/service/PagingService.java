package appsfactory.facebook.comments.service;

import appsfactory.facebook.comments.repository.entity.PagingEntity;
import org.springframework.stereotype.Service;

@Service
public interface PagingService {
  PagingEntity findById(Long id);
}
