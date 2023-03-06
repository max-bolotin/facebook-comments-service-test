package appsfactory.facebook.comments.repository;

import appsfactory.facebook.comments.repository.entity.CommentDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentDataRepository extends JpaRepository<CommentDataEntity, Long> {

}
