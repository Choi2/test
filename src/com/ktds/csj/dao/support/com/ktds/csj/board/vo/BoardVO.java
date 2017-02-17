package com.ktds.csj.dao.support.com.ktds.csj.board.vo;

import com.ktds.csj.dao.support.annotation.Types;

/**
 * Created by Admin on 2017-02-17.
 */
public class BoardVO {

    @Types
    private int board_Id;

    @Types
    private String subject;

    @Types
    private String content;

    @Types
    private String writer;

    @Types
    private int like_Count;

    @Types
    private String write_Date;

    public int getBoard_Id() {
        return board_Id;
    }

    public void setBoard_Id(int board_Id) {
        this.board_Id = board_Id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getLike_Count() {
        return like_Count;
    }

    public void setLike_Count(int like_Count) {
        this.like_Count = like_Count;
    }

    public String getWrite_Date() {
        return write_Date;
    }

    public void setWrite_Date(String write_Date) {
        this.write_Date = write_Date;
    }












}


