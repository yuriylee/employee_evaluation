package org.yu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yu.entity.User;
import org.yu.repository.UserRepository;
import org.yu.service.IUserService;

/**
 * Created by jokernoel on 25.03.18.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }
}
