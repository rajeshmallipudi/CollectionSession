package sample;



public class Employee {
//these are global class veriables
	String name;
	int age;
	String dept;
	public Employee(String name,int age,String dep) {
	//local variables
//local and global variable are same then we need to use this keyword
		
		this.name=name;
		this.age=age;
		this.dept=dept;
	}

}
