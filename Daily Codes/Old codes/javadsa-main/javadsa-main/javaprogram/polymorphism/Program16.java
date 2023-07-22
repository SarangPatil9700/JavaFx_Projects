class Parent{
	Object fun(){
		return new Object();
	}
}
class Child extends Parent{
	String fun(){
		return new String();
	}
}
class Client{
	public static void main(String[] args){
		Parent p=new Child();
		p.fun();
	}
}
