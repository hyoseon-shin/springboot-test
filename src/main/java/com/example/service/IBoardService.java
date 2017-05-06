package com.example.service;

import java.util.List;

import com.example.dao.Board;

public interface IBoardService {

	public String test();
	public List<Board> selectBoardList();
	public Board selectBoardBySeq(String seq);
	public void insertBoard(Board board);

}
