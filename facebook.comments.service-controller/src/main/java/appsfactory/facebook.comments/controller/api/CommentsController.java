package appsfactory.facebook.comments.controller.api;


import appsfactory.facebook.comments.service.CommentFetcherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/facebook-comments")
public class CommentsController {
  private final CommentFetcherService commentFetcherService;

  @GetMapping
  public String helloWorld() {
    return commentFetcherService.fetchComments("123456").toString();
  }
}
