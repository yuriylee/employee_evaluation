package org.yu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.yu.entity.DescribedActivity;

import java.util.List;

/**
 * Created by jokernoel on 25.03.18.
 */
@Repository
public interface DescribedActivityRepository extends JpaRepository<DescribedActivity, Long> {

    @Query(value = "select d from described_activities where activity_id = :activityId and user_id = (select id from users where email = :owner_email)", nativeQuery = true)
    List<DescribedActivity> findByActivityAndOwner(@Param("activityId") long activityId,
                                                   @Param("owner_email") String email);
}
