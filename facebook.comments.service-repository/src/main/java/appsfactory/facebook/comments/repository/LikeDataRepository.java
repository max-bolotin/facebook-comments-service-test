package appsfactory.facebook.comments.repository;

import appsfactory.facebook.comments.repository.entity.LikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeDataRepository extends JpaRepository<LikeEntity, Long> {

}
