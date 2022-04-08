package com.jinho.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(){

        return "board.index";
    }
    @GetMapping("login")
    public String login(){
        return "login";
    }

    @PostMapping("dologin")
    public String dologin(String userID, String userPwd){


        return "redirect:/";
    }

    @GetMapping("join")
    public String join(){
        return "board.join";
    }
    @PostMapping("dojoin")
    public String dojoin(String userID, String userPwd, String userPwd2){
        System.out.println("userID = " + userID);
        System.out.println("userPwd = " + userPwd);
        System.out.println("userPwd2 = " + userPwd2);
        return "redirect:/";
    }


}
