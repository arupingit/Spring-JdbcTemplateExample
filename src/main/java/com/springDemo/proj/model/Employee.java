package com.springDemo.proj.model;

/**
 * The Class Employee.
 */
public class Employee {

	/** The emp name. */
	private String empName;
	
	/** The emp id. */
	private int empId;
	
	/**
	 * Gets the emp name.
	 *
	 * @return the emp name
	 */
	public String getEmpName() {
		return empName;
	}
	
	/**
	 * Sets the emp name.
	 *
	 * @param empName the new emp name
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	/**
	 * Gets the emp id.
	 *
	 * @return the emp id
	 */
	public int getEmpId() {
		return empId;
	}
	
	/**
	 * Sets the emp id.
	 *
	 * @param empId the new emp id
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}
	
	
}
