package appsfactory.facebook.comments.domain.comment;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Like {

  private List<User> data;
  private LikeSummary summary;
}
