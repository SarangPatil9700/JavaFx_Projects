class Program7{
	public static void main(String[] args){
		Program7 obj=new Program7();
		obj.fun(10);
		obj.fun(10.5f);
	}
	void fun(int x){
		System.out.println("In Fun");
		System.out.println(x);
	}
}
