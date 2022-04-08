package com.jinho.web.dao;

import com.jinho.web.entity.Board;
import com.jinho.web.entity.Reply;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ReplyDAO {

    @Autowired
    private SqlSession session;

    public List<Reply> getList(int nID){
        List<Reply> list = session.selectList("Reply.list",nID);
        return list;
    }
    public int write(int nID, String rContent, String userID){
        Map<String,Object> map = new HashMap<>();
        map.put("userID",userID);
        map.put("nID",nID);
        map.put("rContent",rContent);
        int result = session.insert("Reply.write",map);
        return result;
    }
}
