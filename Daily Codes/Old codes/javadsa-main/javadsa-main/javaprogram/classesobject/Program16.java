class Demo{
	int x=10;
	static int y=20;

	Demo(){
		System.out.println("In Constrctor");
	}
	static{
		System.out.println("In static block 1");
	}
	{
		System.out.println("In instance block 1");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
	}
	static{
		System.out.println("In static block 2");
	}
	{
		System.out.println("In instnace block 2");
	}
}
         
