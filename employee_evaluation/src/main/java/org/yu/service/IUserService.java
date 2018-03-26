package org.yu.service;

import org.yu.entity.User;

/**
 * Created by jokernoel on 25.03.18.
 */
public interface IUserService {

    User findByEmail(String email);
}
