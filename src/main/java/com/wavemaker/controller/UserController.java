package com.wavemaker.controller;

import com.wavemaker.model.EmployeeInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;


/**
 * Created by venkateswarluk on 2/8/16.
 */
@Controller
public class UserController {

    static Map<Integer,EmployeeInfo> map = new HashMap<Integer, EmployeeInfo>();

    @RequestMapping("/hello")
    public ModelAndView helloWorld() {

        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setId(1);
        employeeInfo.setName("sunil");
        employeeInfo.setCompany("pramati");
        employeeInfo.setEmail("sunil@wavemaker.com");


        EmployeeInfo employeeInfo1 = new EmployeeInfo();
        employeeInfo1.setId(2);
        employeeInfo1.setName("Uday");
        employeeInfo1.setCompany("pramati");
        employeeInfo1.setEmail("uday@wavemaker.com");

        EmployeeInfo employeeInfo2 = new EmployeeInfo();
        employeeInfo2.setId(3);
        employeeInfo2.setName("arjun");
        employeeInfo2.setCompany("pramati");
        employeeInfo2.setEmail("arjun@wavemaker.com");

        EmployeeInfo employeeInfo3 = new EmployeeInfo();
        employeeInfo3.setId(4);
        employeeInfo3.setName("Venki");
        employeeInfo3.setCompany("pramati");
        employeeInfo3.setEmail("sunil@wavemaker.com");

        map.put(employeeInfo.getId(),employeeInfo);
        map.put(employeeInfo1.getId(),employeeInfo1);
        map.put(employeeInfo2.getId(),employeeInfo2);
        map.put(employeeInfo3.getId(),employeeInfo3);

        ModelAndView model = new ModelAndView("hellousers");
        model.addObject("map", map);

        return model;
    }
}
