package appsfactory.facebook.comments.domain.comment;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LikeData {
  private List<Like> data;
  private LikeSummary summary;
}
