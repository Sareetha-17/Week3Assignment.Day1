package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name is Sareetha");
	}
	
	public void studentDept() {
		System.out.println("My dept is Computer science");
	}
	
	public void studentId() {
		System.out.println("Sareetha Id is 1");
	}

	public static void main(String[] args) {
		
		
		Student stud = new Student();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
				
		
	}

}
