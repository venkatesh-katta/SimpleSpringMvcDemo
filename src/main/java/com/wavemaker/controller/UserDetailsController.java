package com.wavemaker.controller;


import com.wavemaker.model.EmployeeInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static com.wavemaker.controller.UserController.map;

/**
 * Created by venkateswarluk on 3/8/16.
 */
@Controller
public class UserDetailsController {

    @RequestMapping("/usersdetails" )
    public ModelAndView userDetails(@RequestParam("id") int id){
        ModelAndView modelAndView = new ModelAndView("userdetails");
        EmployeeInfo employeeInfo = (EmployeeInfo)map.get(id);

        if(id == employeeInfo.getId()){
            modelAndView.addObject("employee",employeeInfo);
        }else if(id ==employeeInfo.getId()){
            modelAndView.addObject("employee",employeeInfo);
        }else if(id == employeeInfo.getId()){
            modelAndView.addObject("employee",employeeInfo);
        }else{
            modelAndView.addObject("employee",employeeInfo);
        }
        return modelAndView;
    }

}
