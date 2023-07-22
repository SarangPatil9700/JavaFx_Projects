class Demo{
	void m2(){
		System.out.println("Start M2");
		System.out.println(10/0);
		System.out.println("End M2");
	}
	void m1(){
		System.out.println("Start M1");
		m2();
		System.out.println("End M1");
	}
	public static void main(String[] args){
		System.out.println("Start Main");
		Demo obj=new Demo();
		obj.m1();
		obj.m2();
		System.out.println("End Main");
	}
}
