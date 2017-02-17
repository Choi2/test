package com.ktds.csj.dao.support.com.ktds.csj.board.biz;

import com.ktds.csj.dao.support.com.ktds.csj.board.dao.BoardDao;
import com.ktds.csj.dao.support.com.ktds.csj.board.dao.BoardDaoImpl;
import com.ktds.csj.dao.support.com.ktds.csj.board.vo.BoardVO;

import java.util.List;

/**
 * Created by Admin on 2017-02-17.
 */
public class BoardBizImpl implements BoardBiz {
    private BoardDao boardDao;

    public BoardBizImpl() {
        this.boardDao = new BoardDaoImpl();
    }

    @Override
    public boolean writeArticle(BoardVO boardVO) {
        return boardDao.insertArticle(boardVO) > 0;
    }

    @Override
    public List<BoardVO> getAllArticles() {
        return boardDao.selectArticles();
    }

    @Override
    public void printOneBoard(int boardId) {
        BoardVO boardVO = boardDao.findOneArticle(boardId);
    }
}
