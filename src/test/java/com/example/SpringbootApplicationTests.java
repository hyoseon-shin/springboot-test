package com.example;

//import java.sql.Connection;
//
//import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = SpringbootApplication.class)
@WebAppConfiguration
public class SpringbootApplicationTests {

//	@Autowired
//	private DataSource ds;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testConnection() throws Exception {

		System.out.println("Test!!");
//		System.out.println(ds);
//		Connection con = ds.getConnection();
//		System.out.println(con);
//		con.close();

	}

}
