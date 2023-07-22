class Demo{

	void fun(int x,float y){
		System.out.println("Int-float Para");
	}

	void fun(float x,int y){
		System.out.println("float-Int Para");
	}

}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun(10,10);
	}
}
