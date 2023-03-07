package appsfactory.facebook.comments.repository;

import appsfactory.facebook.comments.repository.entity.LikedUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<LikedUserEntity, Long> {

}
