package appsfactory.facebook.comments.domain.comment;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LikeSummary {
  private int total_count;
  private boolean can_like;
  private boolean has_liked;
}
