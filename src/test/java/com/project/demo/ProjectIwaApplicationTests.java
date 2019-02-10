package com.project.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.project.demo.model.Pib;
import com.project.demo.service.implement.PibServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectIwaApplicationTests {
	
	
	
	@Autowired
	private PibServiceImpl pibService;
	
	

	@Test
	public void read() {
		List<Pib> pib = pibService.getAllPibs();
		
		pib.forEach(System.out::println);
		
		
	}
	
	@Test
	@Transactional
	@Rollback(value=true)
	public void insert() {
		pibService.insert(30, 2019, 0);
		
		
	}
	

}

