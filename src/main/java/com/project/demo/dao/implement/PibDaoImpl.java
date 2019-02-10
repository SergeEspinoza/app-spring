package com.project.demo.dao.implement;

import java.util.List;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.project.demo.dao.PibDao;
import com.project.demo.model.Pib;
import com.project.demo.rowMapper.PibRowMapper;

@Repository
public class PibDaoImpl implements PibDao{

	@Autowired
	DataSource datasource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(int pibId, int year, double percent) {
		String sql = "INSERT INTO pibs (pibid, year, percent) VALUES (?, ?, ?)";
	Pib pib= new Pib();
	pib.setPibId(pibId);
	pib.setYear(year);
	pib.setPercent(percent);
	
	jdbcTemplate.update(sql, pib.getPibId(), pib.getYear(), pib.getPercent());
	
	}

	@Override
	public List<Pib> getAllPibs() {
		String sql= "SELECT pibid, year, percent FROM pibs";
		RowMapper<Pib> rowMapper = new PibRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}



	@Override
	public void delete(int pibId) {
		String sql="DELETE from pibs where pibid= ?";
		Pib pib=new Pib();
		pib.setPibId(pibId);
		
		int row= jdbcTemplate.update(sql, pib.getPibId());
		System.out.println("Se elimino exitosamente"+row);
	}
}
