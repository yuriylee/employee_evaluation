package org.yu.service;

import org.yu.entity.DescribedActivity;

import java.util.List;

/**
 * Created by jokernoel on 25.03.18.
 */
public interface IDescribedActivityService {

    DescribedActivity addNew(long activityId, String description, double probability, String email);
    DescribedActivity update(long describedActivityId, String description);
    DescribedActivity update(long describedActivityId, double probability);
    DescribedActivity update(long describedActivityId, String description, double probability);
    DescribedActivity evaluate(long describedActivityId, String descriptionByApprover);
    List<DescribedActivity> findByActivityIdAndEmail(long activityId, String email);
    void remove(long id);

}
