class Outer{
	void m1(){
		System.out.println("In m1-Outer");
	}
	static class Inner{
		void m1(){
			System.out.println("In m1-Inner");
		}
	}
}
class Client{
	public static void main(String[] args){
		Outer.Inner obj=new Outer.Inner();
		obj.m1();
		Outer obj1=new Outer();
		obj1.m1();
	}
}
