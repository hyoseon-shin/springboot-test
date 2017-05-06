package com.springboot.dao;

import java.util.List;

public interface BoardDao { 
	
	public String getCurrentDateTime();
	public List<Board> selectBoardList();
	public Board selectBoardBySeq(String seq);
	public void insertBoard(Board board);

}

