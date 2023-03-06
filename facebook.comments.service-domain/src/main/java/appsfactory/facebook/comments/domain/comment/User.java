package appsfactory.facebook.comments.domain.comment;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

  private String name;
  private String id;
}
