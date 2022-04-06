package com.jinho.web.service;

import com.jinho.web.dao.BoardDAO;
import com.jinho.web.entity.Board;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImp implements BoardService{


    private BoardDAO dao;

    @Override
    public List<Board> getList(int page, String title) {
        List<Board> list = dao.getList(page,title);
        return list;
    }
}
