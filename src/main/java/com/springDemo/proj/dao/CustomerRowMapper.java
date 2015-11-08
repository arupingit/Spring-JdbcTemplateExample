package com.springDemo.proj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springDemo.proj.model.Employee;

/**
 * The Class CustomerRowMapper.
 */
public class CustomerRowMapper implements RowMapper{

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpName(rs.getString("name"));
		employee.setEmpId(rs.getInt("empid"));
		return employee;
	}

	
}
