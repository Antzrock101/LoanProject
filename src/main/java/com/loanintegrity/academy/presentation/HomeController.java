package com.loanintegrity.academy.presentation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


@RequestMapping("/home")
    public String homePage(){

   return "index";

    }




}
