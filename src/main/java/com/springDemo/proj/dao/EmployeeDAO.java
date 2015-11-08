package com.springDemo.proj.dao;

import java.util.List;

import com.springDemo.proj.model.Employee;

/**
 * The Interface EmployeeDAO.
 */
public interface EmployeeDAO {
	
	/**
	 * Save.
	 *
	 * @param employee the employee
	 */
	//Create
	public void save(Employee employee);
	
	/**
	 * Gets the by id.
	 *
	 * @param empId the emp id
	 * @return the by id
	 */
	//Read
	public Employee getById(int empId);
	
	/**
	 * Update emp.
	 *
	 * @param employee the employee
	 */
	//Update
	public void updateEmp(Employee employee);
	
	/**
	 * Delete by id.
	 *
	 * @param employee the employee
	 */
	//Delete
	public void deleteById(Employee employee);
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	//Get All
	public List<Employee> getAll();
}
