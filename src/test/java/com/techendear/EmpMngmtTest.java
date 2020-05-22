package com.techendear;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpMngmtTest {


	private static List<Employee> employees = new ArrayList<Employee>();
	private static EmpMgmt management;
	private static int counter = 0;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		employees.add(new Employee("Ramesh", "ramesh@email.com", "IT"));
		employees.add(new Employee("Mahesh", "mahesh@email.com", "SALES"));
		employees.add(new Employee("Suresh", "suresh@email.com", "IT"));
		employees.add(new Employee("Gangesh", "gangesh@email.com", "IT"));
		employees.add(new Employee("Gautam", "gautam@email.com", "Finance"));
		employees.add(new Employee("Ramshankar", "ramshankar@email.com", "IT"));
		management = new EmpMgmt(employees);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		employees.clear();
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("---------------------");
		System.out.println("Starting TC:"+ ++counter);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Completed TC:"+ counter);
		System.out.println("---------------------");
		System.out.println("");
	}
	
	@Test
	void getAllTest() {
		Assertions.assertNotNull(employees);
		Assertions.assertEquals(6, management.getAllEmployees().size());
	}
	
	@Test
	void getEmployeeByName() {
		Assertions.assertSame(employees.get(0), management.getEmployeeByName("Ramesh"));
	}

}
