package com.jinho.web.entity;

import java.util.Date;

public class Board {
    private int nID;
    private String nTitle;
    private String nContent;
    private String userID;
    private Date regDate;
    private int hit;
    private int likes;

    public Board() {
    }
    public Board(int nID, String nTitle, String nContent, String userID, Date regDate, int hit, int likes) {
        this.nID = nID;
        this.nTitle = nTitle;
        this.nContent = nContent;
        this.userID = userID;
        this.regDate = regDate;
        this.hit = hit;
        this.likes = likes;
    }

    public int getnID() {
        return nID;
    }

    public void setnID(int nID) {
        this.nID = nID;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public String getnContent() {
        return nContent;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Board{" +
                "nID=" + nID +
                ", nTitle='" + nTitle + '\'' +
                ", nContent='" + nContent + '\'' +
                ", userID='" + userID + '\'' +
                ", regDate=" + regDate +
                ", hit=" + hit +
                ", likes=" + likes +
                '}';
    }
}
