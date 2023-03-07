package appsfactory.facebook.comments.domain.paging;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Paging {
  private Cursor cursors;
  private String next;
}
