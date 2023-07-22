class Project{
	String projName="Online Edu";
	int noOfEmp=20;
	void ClientInfo(){
		String clientName="Core2Web";
		System.out.println(clientName);
		System.out.println(projName);
		System.out.println(noOfEmp);
	}
}
class C2W{
	public static void main(String[] args){
		Project obj=new Project();
		obj.ClientInfo();
	}
}
