package com.jinho.web.service;

import com.jinho.web.dao.BoardDAO;
import com.jinho.web.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImp implements BoardService{

    @Autowired
    private BoardDAO dao;

    @Override
    public List<Board> getList(int page, String title) {
        int statement = (page-1)*10;
        List<Board> list = dao.getList(statement,title);
        return list;
    }

    @Override
    public int dowrite(String nTitle, String nContent, String userID) {
        int result=dao.dowrite(nTitle,nContent,userID);
        return result;
    }

    @Override
    public Board getDetail(int id) {
        Board vo = dao.getDetail(id);
        return vo;
    }
}
