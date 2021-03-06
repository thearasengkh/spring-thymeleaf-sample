package com.jsaccounting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController extends AbstractBaseController {

    @RequestMapping("/")
    public String index() {
        return getFullViewName("index");
    }

    @RequestMapping("/about-us")
    public String aboutUs() {
        return getFullViewName("about-us");
    }

    @RequestMapping("/our-service")
    public String ourService() {
        return getFullViewName("our-service");
    }

    @RequestMapping("/news-and-events")
    public String newAndEvent() {
        return getFullViewName("news-and-events");
    }

    @RequestMapping("/contact")
    public String contact() {
        return getFullViewName("contact");
    }

    protected String getFullViewName(String viewName){
        return "front/".concat(viewName);
    }

}
