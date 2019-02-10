package com.project.demo.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.demo.model.Pib;

public class PibRowMapper implements RowMapper<Pib>{

	public Pib mapRow(ResultSet rs, int rowNum) throws SQLException{
	Pib pib = new Pib();
	pib.setPibId(rs.getInt("pibid"));
	pib.setYear(rs.getInt("year"));
	pib.setPercent(rs.getDouble("percent"));
	return pib;
	
	}
	
}
