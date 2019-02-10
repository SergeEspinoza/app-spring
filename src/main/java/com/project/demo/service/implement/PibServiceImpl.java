package com.project.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.dao.PibDao;
import com.project.demo.model.Pib;
import com.project.demo.service.PibService;

@Service
public class PibServiceImpl implements PibService{

	@Autowired PibDao pibDao;
	
	@Override
	public void insert(int pibId, int year, double percent) {
		pibDao.insert(pibId, year, percent);
	}

	@Override
	public List<Pib> getAllPibs() {
		return pibDao.getAllPibs();
	}

	@Override
	public void delete(int pibId) {
		pibDao.delete(pibId);
		
	}
	
	
}
