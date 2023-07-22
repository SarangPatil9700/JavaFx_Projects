class Demo{
	int x=10;
	Demo(){
		System.out.println("In No Argument Constructor");
	}
	Demo(int x){
		System.out.println("In Parametrized Constructor");
	}
	public static void main(String[] args){
		Demo obj1=new Demo();
		Demo obj2=new Demo(10);
	}
}
