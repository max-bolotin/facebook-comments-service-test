package appsfactory.facebook.comments.domain.comment;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Like {
  private List<LikedUser> data;
  private LikeSummary summary;
}
