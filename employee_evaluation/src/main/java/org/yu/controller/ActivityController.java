package org.yu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.yu.service.IDescribedActivityService;

/**
 * Created by jokernoel on 25.03.18.
 */
@Controller("/activity")
public class ActivityController {

    @Autowired
    private IDescribedActivityService describedActivityService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addActivity(Long activityId, String description, Double probability) {
        if (activityId != null) {
            if (description != null && probability != null){
                describedActivityService.addNew(activityId, description, probability, "");
            }
        }
    }
}
