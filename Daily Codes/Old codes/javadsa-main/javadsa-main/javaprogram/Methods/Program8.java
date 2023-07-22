class Program8{
	public static void main(String[] args){
		Program8 obj=new Program8();
		obj.fun(10);
		obj.fun(10.5f);
		obj.fun('A');
		obj.fun(true);
	}
	void fun(float x){
		System.out.println("In fun");
		System.out.println(x);
	}
	
}

