package appsfactory.facebook.comments.service;

import appsfactory.facebook.comments.repository.entity.CommentEntity;

public interface CommentService {
  CommentEntity findById(Long id);
}
