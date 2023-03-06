package appsfactory.facebook.comments.repository;

import appsfactory.facebook.comments.repository.entity.LikeDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeDataRepository extends JpaRepository<LikeDataEntity, Long> {

}
