package com.java.example;

/** A class contains department related information.
 * 
 * @author suraj
 *
 */
public class Department {

	private Long id;
	private String departmentName;
	private Employee employee;

	/**
	 * Default constructor.
	 */
	public Department() {
		// TODO Auto-generated constructor stub
	}

	/** Parameterize constructor.
	 * 
	 * @param id department id
	 * @param departmentName name of department
	 * @param employee instance of {@link Employee}
	 */
	public Department(Long id, String departmentName, Employee employee) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.employee = employee;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
