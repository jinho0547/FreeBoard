package com.jinho.web.dao;

import com.jinho.web.entity.Board;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {

    @Autowired
    private SqlSession session;

    public List<Board> getList(int page, String title){
        return session.selectList("Test.test");
    }
}
