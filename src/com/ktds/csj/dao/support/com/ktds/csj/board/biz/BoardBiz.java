package com.ktds.csj.dao.support.com.ktds.csj.board.biz;
import com.ktds.csj.dao.support.com.ktds.csj.board.vo.BoardVO;
import java.util.List;

/**
 * Created by Admin on 2017-02-17.
 */
public interface BoardBiz {

    public boolean writeArticle(BoardVO boardVO);
    public List<BoardVO> getAllArticles();
    public void printOneBoard(int boardId);

}
