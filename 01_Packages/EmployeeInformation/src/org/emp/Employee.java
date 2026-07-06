package org.emp;

import org.company.Company;
import org.client.Client;
import org.project.Project;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Company comp = new Company();
        Client client = new Client();
        Project project = new Project();
        
        emp.empName();
        comp.companyName();
        client.clientName();
        project.projectName();
	}
	
	public void empName() {
		System.out.println("Employee Name");
	}

}
