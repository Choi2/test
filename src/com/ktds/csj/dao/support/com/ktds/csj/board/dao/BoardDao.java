package com.ktds.csj.dao.support.com.ktds.csj.board.dao;

import com.ktds.csj.dao.support.com.ktds.csj.board.vo.BoardVO;
import java.util.List;

/**
 * Created by Admin on 2017-02-17.
 */
public interface BoardDao {

    public int insertArticle(BoardVO boardVO);
    public List findOneArticle(int boardId);
    public List selectArticles();

}
