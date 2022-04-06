package com.jinho.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/board/")
public class BoardController {


    @GetMapping("list")
    public String list(@RequestParam(defaultValue = "1")int p,@RequestParam(defaultValue = "") String t){

        return "board.list";
    }
    @GetMapping("detail")
    public String detail(int id){
        return "board.detail";
    }
    @GetMapping("write")
    public String write(){
        return "board.write";
    }
}