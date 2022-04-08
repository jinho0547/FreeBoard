package com.jinho.web.service;

import com.jinho.web.entity.Reply;

import java.util.List;

public interface ReplyService {
    List<Reply> getList(int nID);
    int write(int nID, String rContent, String userID);
    int delete(int rno);
    int update(int nID, String rContent, String userID);
}
