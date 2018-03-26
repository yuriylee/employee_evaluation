package org.yu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yu.entity.Activity;

/**
 * Created by jokernoel on 25.03.18.
 */
@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
