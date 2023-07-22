class Society{

	Society(){
		System.out.println("In Society Constructor");
	}

	void Wing(){
		System.out.println("Wing A");
	}
}
class Flat extends Society{

	Flat(){
		System.out.println("In Flat Constructor");
	}
}
class Information{

	public static void main(String[] args){
	Flat obj=new Flat();
	obj.Wing();
	}
}
