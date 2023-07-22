class Demo{
	void m1(){
		System.out.println("In M1");
	}
	void m2(){
		System.out.println("In M2");
	}
	public static void main(String[] args){
		System.out.println("Start Main");
		Demo obj=new Demo();
		obj.m1();
		obj=null;
		obj.m2();
		System.out.println("End Main");
	}
}
