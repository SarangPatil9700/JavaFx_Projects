class Employee{
	int empId=10;
	String empName="Suyash";

	void empInfo(){
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
	}
}

class MainDemo{
	public static void main(String[] args){
		Employee obj=new Employee();
		obj.empInfo();

		System.out.println(obj.empId);
		System.out.println(obj.empName);
	}
}
