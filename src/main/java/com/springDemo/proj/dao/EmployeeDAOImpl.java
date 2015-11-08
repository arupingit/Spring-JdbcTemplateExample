package com.springDemo.proj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springDemo.proj.model.Employee;

/**
 * The Class EmployeeDAOImpl.
 */
@Repository("empDao")
public class EmployeeDAOImpl implements EmployeeDAO{

	/** The jdbc template. */
	JdbcTemplate jdbcTemplate;
	
	/** The Constant EMP_INSERT. */
	private static final String EMP_INSERT = "insert into testuser.emp_tb (name, empid) values (?,?)";
	
	/** The Constant EMP_SELECT_BYID. */
	private static final String EMP_SELECT_BYID = "select * from testuser.emp_tb where empid = ?";
	
	/** The Constant EMP_UPDATE. */
	private static final String EMP_UPDATE = "update testuser.emp_tb set name= ? where empid= ?";
	
	/** The Constant EMP_DELETE. */
	private static final String EMP_DELETE = "delete from testuser.emp_tb where empid= ?";
	
	/** The Constant EMP_SELECT. */
	private static final String EMP_SELECT = "select * from testuser.emp_tb";
	
	/**
	 * Sets the jdbc template.
	 *
	 * @param jdbcTemplate the new jdbc template
	 */
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/* (non-Javadoc)
	 * @see com.springDemo.proj.dao.EmployeeDAO#save(com.springDemo.proj.model.Employee)
	 */
	public void save(Employee employee) {
		String query = EMP_INSERT;
        int out = jdbcTemplate.update(query, new Object[]{employee.getEmpName(),employee.getEmpId()});
        System.out.println(out);
	}

	/* (non-Javadoc)
	 * @see com.springDemo.proj.dao.EmployeeDAO#getById(int)
	 */
	public Employee getById(int empId) {
		String query = EMP_SELECT_BYID;
		Employee employee = jdbcTemplate.queryForObject(query, new Object[]{empId}, new CustomerRowMapper());
		return employee;
	}

	/* (non-Javadoc)
	 * @see com.springDemo.proj.dao.EmployeeDAO#updateEmp(com.springDemo.proj.model.Employee)
	 */
	public void updateEmp(Employee employee) {
		String query = EMP_UPDATE;
		int result = jdbcTemplate.update(query, new Object[]{employee.getEmpName(),employee.getEmpId()});
		System.out.println(result);
	}

	/* (non-Javadoc)
	 * @see com.springDemo.proj.dao.EmployeeDAO#deleteById(com.springDemo.proj.model.Employee)
	 */
	public void deleteById(Employee employee) {
		String query = EMP_DELETE;
		int result = jdbcTemplate.update(query, new Object[]{employee.getEmpId()});
		System.out.println(result);
	}

	/* (non-Javadoc)
	 * @see com.springDemo.proj.dao.EmployeeDAO#getAll()
	 */
	public List<Employee> getAll() {
		String query = EMP_SELECT;
		@SuppressWarnings("unchecked")
		List<Employee> employees = jdbcTemplate.query(query, new CustomerRowMapper());
		return employees;
	}

}
