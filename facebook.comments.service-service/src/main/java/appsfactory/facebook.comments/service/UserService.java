package appsfactory.facebook.comments.service;

import appsfactory.facebook.comments.repository.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
  UserEntity findById(Long id);
}
