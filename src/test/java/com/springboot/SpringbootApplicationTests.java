package com.springboot;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.springboot.dao.Board;
import com.springboot.service.impl.BoardServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SpringbootApplicationTests {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private BoardServiceImpl boardService;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testService() throws Exception {
		LOG.info("testService");

		Board board = new Board();

		board.setTitle("title3");
		board.setContent("content3");
		board.setWriter("writer3");
		board.setPasswd("3333");

		LOG.info("board : {}", board.toString());
		boardService.insertBoard(board);

		List<Board> boardList = boardService.selectBoardList();

		LOG.info("boardList : {}", boardList.toString());
	}
}
