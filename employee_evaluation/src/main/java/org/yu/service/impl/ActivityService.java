package org.yu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yu.entity.Activity;
import org.yu.repository.ActivityRepository;
import org.yu.service.IActivityService;

import java.util.List;

/**
 * Created by jokernoel on 25.03.18.
 */
@Service
public class ActivityService implements IActivityService {

    @Autowired
    private ActivityRepository repository;

    @Override
    public Activity findById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public List<Activity> findAll() {
        return repository.findAll();
    }
}
