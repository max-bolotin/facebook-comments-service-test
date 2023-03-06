package appsfactory.facebook.comments.repository;

import appsfactory.facebook.comments.repository.entity.PagingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagingRepository extends JpaRepository<PagingEntity, Long> {

}
