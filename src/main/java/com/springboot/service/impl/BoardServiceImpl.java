package com.springboot.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.Board;
import com.springboot.dao.BoardDao;
import com.springboot.service.IBoardService;

@Service
public class BoardServiceImpl implements IBoardService {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	BoardDao boardDao;

	@Override
	public String test(){
		LOG.debug("test");
		return boardDao.getCurrentDateTime();
	}

	@Override
	public List<Board> selectBoardList(){
		LOG.debug("selectBoardList");
		return boardDao.selectBoardList();
	}

	@Override
	public Board selectBoardBySeq(String seq) {
		LOG.debug("selectBoardBySeq seq = {}", seq);
		return boardDao.selectBoardBySeq(seq);
	}

	@Override
	public void insertBoard(Board board) {
		LOG.debug("insertBoard board = {}", board.toString());
		boardDao.insertBoard(board);
	}
}
