package appsfactory.facebook.comments.repository;

import appsfactory.facebook.comments.repository.entity.CursorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursorRepository extends JpaRepository<CursorEntity, Long> {

}
