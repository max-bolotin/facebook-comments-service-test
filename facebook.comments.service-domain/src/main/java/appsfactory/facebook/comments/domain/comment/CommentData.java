package appsfactory.facebook.comments.domain.comment;

import appsfactory.facebook.comments.domain.Comment;
import appsfactory.facebook.comments.domain.paging.Paging;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentData {

  private List<Comment> data;
  private Paging paging;
}
