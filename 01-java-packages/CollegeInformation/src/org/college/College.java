package org.college;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College coll = new College();
        Student stu = new Student();
        Hostel host = new Hostel();
        Dept dept = new Dept();
		
		coll.collegeName();
		coll.collegeCode();
		coll.collegeRank();
		
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		
		host.hostelName();
		
		dept.deptName();
	}
	
	public void collegeName() {
        System.out.println("College Name");
    }

    public void collegeCode() {
        System.out.println("College Code");
    }

    public void collegeRank() {
        System.out.println("College Rank");
    }

}
