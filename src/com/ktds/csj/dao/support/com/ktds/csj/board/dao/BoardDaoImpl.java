package com.ktds.csj.dao.support.com.ktds.csj.board.dao;

import com.ktds.csj.dao.support.JDBCDaoSupport;

import com.ktds.csj.dao.support.QueryHandler;
import com.ktds.csj.dao.support.annotation.BindData;
import com.ktds.csj.dao.support.com.ktds.csj.board.vo.BoardVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * Created by Admin on 2017-02-17.
 */
public class BoardDaoImpl extends JDBCDaoSupport implements BoardDao {

    @Override
    public int insertArticle(BoardVO boardVO) {
        return Update(new QueryHandler() {

            @Override
            public String preparedQuery() {
                StringBuffer query = new StringBuffer();
                query.append(" INSERT    INTO   BOARD (  BOARD_ID ");
                query.append("                  , SUBJECT ");
                query.append("                  , CONTENT ");
                query.append("                  , WRITER ");
                query.append("                  , LIKE_COUNT ");
                query.append("                  , WRITE_DATE ");
                query.append("                  ) ");
                query.append(" VALUES           ( ");
                query.append("                         BOARD_ID_SEQ.NEXTVAL ");
                query.append("                         , ? ");
                query.append("                         , ? ");
                query.append("                         , ? ");
                query.append("                         , 0 ");
                query.append("                         , SYSDATE ");
                query.append("                     ) ");
                return query.toString();
            }

            @Override
            public void mappingParameters(PreparedStatement stmt) throws SQLException {
                    stmt .setString(1, boardVO.getSubject());
                    stmt .setString(2, boardVO.getContent());
                    stmt .setString(3, boardVO.getWriter());
            }

            @Override
            public Object getData(ResultSet rs) {
                BoardVO boardVO = new BoardVO();
                BindData.bindData(rs, boardVO);
                return boardVO;
            }

        }  );
    }

    @Override
    public List findOneArticle(int boardId) {
        return selectList(new QueryHandler() {

            @Override
            public String preparedQuery() {
                StringBuffer query = new StringBuffer();
                query.append(" SELECT  BOARD_ID ");
                query.append("        , SUBJECT ");
                query.append("        , WRITER ");
                query.append("        , LIKE_COUNT ");
                query.append("        , WRITE_DATE ");
                query.append(" FROM    BOARD ");
                query.append(" WHERE    BOARD_ID = ? ");
                return query.toString();
            }

            @Override
            public void mappingParameters(PreparedStatement stmt) throws SQLException {
                    stmt.setInt(1, boardId);
            }

            @Override
            public Object getData(ResultSet rs) {
                return null;
            }
        });
    }

    @Override
    public List<BoardVO> selectArticles() {
        return selectList(new QueryHandler() {
            @Override
            public String preparedQuery() {
                StringBuffer query = new StringBuffer();
                query.append(" SELECT  BOARD_ID ");
                query.append("        , SUBJECT ");
                query.append("        , WRITER ");
                query.append("        , LIKE_COUNT ");
                query.append("        , WRITE_DATE ");
                query.append(" FROM    BOARD ");
                return query.toString();
            }

            @Override
            public void mappingParameters(PreparedStatement stmt) throws SQLException {
            }

            @Override
            public Object getData(ResultSet rs) {
                BoardVO boardVO = new BoardVO();
                BindData.bindData(rs, boardVO);
                return boardVO;
            }
        });
    }
}
