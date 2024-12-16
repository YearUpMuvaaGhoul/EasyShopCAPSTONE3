package org.yearup.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {

    @RequestMapping(path="/test", method= RequestMethod.GET)
    public String test(){
        return "hello";
    }
}
