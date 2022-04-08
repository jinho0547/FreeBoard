package com.jinho.web.dao;

import com.jinho.web.entity.Board;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BoardDAO {

    @Autowired
    private SqlSession session;

    public List<Board> getList(int page, String title){
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("title",title);
        return session.selectList("Board.list",map);
    }

    public int dowrite(String nTitle, String nContent, String userID) {
        Map<String,Object> map = new HashMap<>();
        map.put("nTitle",nTitle);
        map.put("nContent",nContent);
        map.put("userID",userID);
        int result = session.insert("Board.write",map);
        return result;
    }

    public Board getDetail(Integer id){
        Board vo = session.selectOne("Board.detail",id);
        return vo;
    }
}
