package appsfactory.facebook.comments.domain;

import appsfactory.facebook.comments.domain.comment.Like;
import appsfactory.facebook.comments.domain.comment.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Comment {
    private String id;
    private User from;
    private String message;
    private String created_time;
    private Like likes;
}
