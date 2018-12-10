package com.loanintegrity.academy.presentation;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfirmationController {


    @RequestMapping("/confirm")
    public String ConfirmationPage () {

        return "confirmation";
    }


}
