package appsfactory.facebook.comments.service.impl;

import appsfactory.facebook.comments.repository.CommentRepository;
import appsfactory.facebook.comments.repository.entity.CommentEntity;
import appsfactory.facebook.comments.service.CommentService;

public class CommentServiceImpl implements CommentService {

  private final CommentRepository commentRepository;

  public CommentServiceImpl(CommentRepository commentRepository) {
    this.commentRepository = commentRepository;
  }

  @Override
  public CommentEntity findById(Long id) {
    return commentRepository.findById(id).orElseThrow(
        () -> new RuntimeException(String.format("Comment with id %s not found", id)));
  }
}
