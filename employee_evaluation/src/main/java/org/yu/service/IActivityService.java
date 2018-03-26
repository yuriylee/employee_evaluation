package org.yu.service;

import org.yu.entity.Activity;

import java.util.List;

/**
 * Created by jokernoel on 25.03.18.
 */
public interface IActivityService {

    Activity findById(Long id);
    List<Activity> findAll();
}
