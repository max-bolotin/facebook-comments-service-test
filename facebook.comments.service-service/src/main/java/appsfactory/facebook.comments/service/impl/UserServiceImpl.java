package appsfactory.facebook.comments.service.impl;

import appsfactory.facebook.comments.repository.entity.UserEntity;
import appsfactory.facebook.comments.repository.UserRepository;
import appsfactory.facebook.comments.service.UserService;

public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserEntity findById(Long id) {
    return userRepository.findById(id).orElseThrow(
        () -> new RuntimeException(String.format("User with id %s not found", id)));
  }
}
