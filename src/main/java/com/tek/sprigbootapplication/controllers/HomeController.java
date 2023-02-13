package com.tek.sprigbootapplication.controllers;


import com.tek.sprigbootapplication.models.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@Slf4j
public class HomeController {

    @Value("${app.myname}")
    String myname;

    //@GetMapping ("/studentinfo") same as RequestMethod.GET
//    @RequestMapping(value = "/studentinfo", method = {RequestMethod.GET, RequestMethod.GET})
//    public String logStudentInformation(Model model){
//
//        Student student = new Student("lana@gmail.com", "lana", "password");
//        model.addAttribute("stu", student);
//        model.addAttribute("date", new Date());
//        model.addAttribute("myname", myname);
//        model.getAttribute("myname");
//            log.info("we did it!");
//        return "index"; //html
//    }
    @GetMapping("/studentinfo")
    public ModelAndView logStudent(){
        ModelAndView modelAndView = new ModelAndView();
        Student student = new Student("lana@gmail.com", "lana", "password");
        modelAndView.addObject("stu", student);
        modelAndView.addObject("date", new Date());
        modelAndView.addObject("myname", myname);

        modelAndView.setViewName("index");

        return modelAndView;
    }
}
