package appsfactory.facebook.comments.domain.paging;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Paging {
  private Cursor cursors;
  private String next;
}
