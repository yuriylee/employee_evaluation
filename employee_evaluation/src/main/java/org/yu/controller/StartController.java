package org.yu.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jokernoel on 24.03.18.
 */
//@RestController
@Controller
public class StartController {

    //@RequestMapping("/")

    @RequestMapping("/hello")
    public String hello(){
        return "hello!!!";
    }

}
