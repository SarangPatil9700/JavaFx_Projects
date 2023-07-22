class Outer{
	static class Inner{
		void m1(){
			System.out.println("In M-1");
		}
	}
}
class Client{
	public static void main(String[] args){
		Outer.Inner obj1=new Outer.Inner();
		obj1.m1();
	}
}
