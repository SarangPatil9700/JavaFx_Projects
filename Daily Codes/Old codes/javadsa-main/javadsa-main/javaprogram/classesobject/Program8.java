class Employee{
	int empId=10;
	String empName="Suyash";

	static int y=50;

	void empInfo(){
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("y="+y);
	}
}

class MainDemo{
	public static void main(String[] args){
		Employee obj1=new Employee();
		Employee obj2=new Employee();

		obj1.empInfo();
		obj2.empInfo();

		System.out.println("--------------------------------");

		obj2.empId=20;
		obj2.empName="Rahul";
		obj2.y=5000;

		obj1.empInfo();
                obj2.empInfo();
	}
}
