package appsfactory.facebook.comments.domain;

import appsfactory.facebook.comments.domain.comment.Like;
import appsfactory.facebook.comments.domain.comment.User;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Comment {
    private String id;
    private User from;
    private String message;
    private String created_time;
    private List<Like> likes;
}
