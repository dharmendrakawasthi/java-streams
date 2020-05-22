package com.techendear;

import java.util.List;
import java.util.function.Predicate;

public class EmpMgmt {

	List<Employee> employees;

	public EmpMgmt() {
	}

	public EmpMgmt(List<Employee> employees) {
		this.employees = employees;
	}

	public boolean authenticateEmployee(String uname, String pass) {

		Predicate<Employee> p = employee -> employee.getUname().equals(uname) && employee.getPass().equals(pass);

		for (Employee e : employees) {
			if (p.test(e)) {
				return true;
			}
		}
		return false;
	}

	public List<Employee> getAllEmployees() {
		return employees;
	}

	public Employee getEmployeeByName(String name) {
		Predicate<Employee> p = employee -> employee.getName().equals(name);
		for (Employee employee : employees) {
			if (p.test(employee)) {
				return employee;
			}
		}
		return null;
	}

	public Employee addEmployee(Employee employee) {
		employees.add(employee);
		return employee;
	}
}
