package com.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.jdbc.StringUtils;
import com.springboot.dao.Board;
import com.springboot.service.IBoardService;

@RestController
public class BoardController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	IBoardService boardService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		LOG.info("call test");
		String time = boardService.test();
		return "Test!!" + time;
	}

	@RequestMapping(value = "/selectBoardList", method = RequestMethod.GET)
	@ResponseBody
	public List<Board> selectBoardList() {
		LOG.info("call selectBoardList");

		List<Board> boardList = boardService.selectBoardList();		

		return boardList;
	}

	@RequestMapping(value = "/selectBoardBySeq", method = RequestMethod.GET)
	public Board selectBoardBySeq(@RequestParam(value="seq")String seq) {
		LOG.info("call selectBoardBySeq, seq = {}", seq);

		Board board = boardService.selectBoardBySeq(seq);

		return board;
	}

	@RequestMapping(value = "/addBoard", method = RequestMethod.POST)
	public Board addBoard(@RequestBody Board board) {
		LOG.info("call addBoard, board = {}", board == null ? null : board.toString());

		if (board == null || StringUtils.isNullOrEmpty(board.getTitle())
				|| StringUtils.isNullOrEmpty(board.getContent())
				|| StringUtils.isNullOrEmpty(board.getWriter())
				|| StringUtils.isNullOrEmpty(board.getPasswd())) {
			return null;
		}

		boardService.insertBoard(board);

		return board;
	}
	
}
