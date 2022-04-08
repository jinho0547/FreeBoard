package com.jinho.web.controller;

import com.jinho.web.entity.Board;
import com.jinho.web.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/board/")
public class BoardController {

    @Autowired
    private BoardService service;

    @GetMapping("list")
    public String list(@RequestParam(defaultValue = "1")Integer p, @RequestParam(defaultValue = "") String t, Model m){
        List<Board> list = service.getList(p,t);
        m.addAttribute("list",list);
        return "board.list";
    }
    @GetMapping("detail")
    public String detail(int id, Model m){
        Board detail = service.getDetail(id);
        m.addAttribute("detail",detail);
        return "board.detail";
    }
    @GetMapping("write")
    public String write(){
        return "board.write";
    }

    @PostMapping("dowrite")
    public String dowrite(String nTitle, String nContent){
        String userID = "jinho";
        service.dowrite(nTitle,nContent,userID);
        return "redirect:list";
    }
}
