package com.ktds.csj.dao.support.com.ktds.csj.board.controller;

import com.ktds.csj.dao.support.com.ktds.csj.board.biz.BoardBiz;
import com.ktds.csj.dao.support.com.ktds.csj.board.biz.BoardBizImpl;
import com.ktds.csj.dao.support.com.ktds.csj.board.vo.BoardVO;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Admin on 2017-02-17.
 */
public class BoardController {

    private BoardBiz boardBiz;

    public BoardController() {
        boardBiz = new BoardBizImpl();
    }

    public void writeAArticle() {
        BoardVO boardVO = new BoardVO();
        boardVO.setWriter("최성진");
        boardVO.setSubject("주말과제..?");
        boardVO.setContent("줄까요??"); // 아녀 주지 마세요.

        if(boardBiz.writeArticle(boardVO)) {
            System.out.println("글 쓰기를 성공하였습니다. ");
        }

        else {
            System.out.println("글 쓰기를 실패했습니다");
        }

        boardBiz.writeArticle(boardVO);
    }

    public void printAllarticles() {
        List<BoardVO> articles = boardBiz.getAllArticles();

        for(BoardVO article : articles) {
            System.out.println("글 번호 : " + article.getBoard_Id());
            System.out.println("제목 : " + article.getSubject());
            System.out.println("작성자 : " + article.getWriter());
            System.out.println("작성일 : " + article.getWrite_Date());
            System.out.println("=========================================");
        }
    }



    public static void main(String[] args) {
            new BoardController().start();
    }

    public void start() {

        Scanner input = new Scanner(System.in);
        int choose = 0;

        while(true) {
            System.out.println("=======================================");
            System.out.println("ktds universiry");
            System.out.println("1. Write");;
            System.out.println("2. LIST");
            System.out.println("3. Find One ");
            System.out.println("=======================================");
            System.out.println("choice : ");


            choose = input.nextInt();
            if(choose == 1) {
                writeAArticle();
            }

            else if(choose == 2) {
                printAllarticles();
            }

            else if(choose == 3) {
                pri
            }

            else {
                System.out.println("잘못 입력하세요...");
            }


        }


    }
}
