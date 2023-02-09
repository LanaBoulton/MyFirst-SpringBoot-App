package com.tek.sprigbootapplication.controllers;


import com.tek.sprigbootapplication.models.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@Slf4j
public class HomeController {


    //@GetMapping ("/studentinfo") same as RequestMethod.GET
    @RequestMapping(value = "/studentinfo", method = {RequestMethod.GET, RequestMethod.GET})
    public String logStudentInformation(Model model){
        Student student = new Student("lana@gmail.com", "lana", "password");
        model.addAttribute("stu", student);
        model.addAttribute("date", new Date());
            log.info("we did it!");
        return "index"; //html
    }
}
