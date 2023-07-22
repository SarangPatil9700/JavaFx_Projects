class Program2{
	int x=10;
	static int y=20;
	void fun(){
		System.out.println("In fun Method");
	}
	static void gun(){
		System.out.println("In gun Method");
	}
	public static void main(String[] args){
		Program2 obj=new Program2();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.gun();

	}
}
