package org.yu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.yu.entity.Activity;
import org.yu.entity.DescribedActivity;
import org.yu.entity.User;
import org.yu.repository.DescribedActivityRepository;
import org.yu.service.IActivityService;
import org.yu.service.IDescribedActivityService;
import org.yu.service.IUserService;

import java.util.List;

/**
 * Created by jokernoel on 25.03.18.
 */
@Service
public class DescribedActivityService implements IDescribedActivityService {

    @Autowired
    private DescribedActivityRepository repository;
    @Autowired
    private IActivityService activityService;
    @Autowired
    private IUserService userService;

    @Override
    public DescribedActivity addNew(long activityId, String description, double probability, String email) {
        Activity activity = activityService.findById(activityId);
        User owner = userService.findByEmail(email);
        if (activity != null) {
            repository.save(new DescribedActivity(activity, description, probability, owner));
        }
        return null;
    }

    @Override
    public DescribedActivity update(long describedActivityId, String description) {
        DescribedActivity describedActivity = repository.getOne(describedActivityId);
        if (describedActivity != null && currentLoggedUser().equals(describedActivity.getUser().getEmail())) {
            describedActivity.setDescription(description);
            return repository.save(describedActivity);
        }
        return null;
    }

    @Override
    public DescribedActivity update(long describedActivityId, double probability) {
        DescribedActivity describedActivity = repository.getOne(describedActivityId);
        if (describedActivity != null && currentLoggedUser().equals(describedActivity.getUser().getEmail())) {
            describedActivity.setProbability(probability);
            return repository.save(describedActivity);
        }
        return null;
    }

    @Override
    public DescribedActivity update(long describedActivityId, String description, double probability) {
        DescribedActivity describedActivity = repository.getOne(describedActivityId);
        if (describedActivity != null && currentLoggedUser().equals(describedActivity.getUser().getEmail())) {
            describedActivity.setDescription(description);
            describedActivity.setProbability(probability);
            return repository.save(describedActivity);
        }
        return null;
    }

    @Override
    public DescribedActivity evaluate(long describedActivityId, String descriptionByApprover) {
        DescribedActivity describedActivity = repository.getOne(describedActivityId);
        return null;
    }

    @Override
    public List<DescribedActivity> findByActivityIdAndEmail(long activityId, String email) {
        return repository.findByActivityAndOwner(activityId, email);
    }

    @Override
    public void remove(long id) {
        repository.deleteById(id);
    }

    private String currentLoggedUser() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
