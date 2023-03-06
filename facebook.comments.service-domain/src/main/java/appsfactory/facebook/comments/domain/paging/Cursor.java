package appsfactory.facebook.comments.domain.paging;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cursor {

  private String before;
  private String after;
}
