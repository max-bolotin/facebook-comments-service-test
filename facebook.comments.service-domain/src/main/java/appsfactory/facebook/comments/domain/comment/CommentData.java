package appsfactory.facebook.comments.domain.comment;

import appsfactory.facebook.comments.domain.Comment;
import appsfactory.facebook.comments.domain.paging.Paging;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommentData {

  private List<Comment> data;
  private Paging paging;
}
