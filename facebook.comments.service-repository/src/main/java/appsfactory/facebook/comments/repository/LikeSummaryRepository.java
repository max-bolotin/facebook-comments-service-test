package appsfactory.facebook.comments.repository;

import appsfactory.facebook.comments.repository.entity.LikeSummaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeSummaryRepository extends JpaRepository<LikeSummaryEntity, Long> {

}
