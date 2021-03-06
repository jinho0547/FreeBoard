package com.jinho.web.service;

import com.jinho.web.entity.Board;

import java.util.List;

public interface BoardService {
    List<Board> getList(int page, String title);
    int dowrite(String nTitle, String nContent, String userID);
    Board getDetail(int id);
}
