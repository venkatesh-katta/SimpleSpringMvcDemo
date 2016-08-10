package com.wavemaker.controller;
/*
 * Created by venkateswarluk on 2/8/16.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeWorldController {

    @RequestMapping("/welcome")
    public ModelAndView welcome(){
        String message = "Welcome the page";
        return new ModelAndView("welcomepage","message",message);
    }
}
