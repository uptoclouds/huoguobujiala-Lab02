package se331.lab.rest.repository;

import se331.lab.rest.entity.MedalEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedalEventRepository extends JpaRepository<MedalEvent, Long> {
    Page<MedalEvent> findAll(Pageable pageable);
}
