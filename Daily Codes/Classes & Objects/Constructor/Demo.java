class Demo{
	static{
		 System.out.println("Static Block1");
	}
	public static void main(String[] args){
		System.out.println("In Demo main");
	}
}
class Client{
	static{
		System.out.println("Static Block2");
	}
	public static void main(String[] args){
		System.out.println("In client main");
	}
	static{
		System.out.println("In Demo main");
	}
	static{
		System.out.println("Static Block3");
	}
}

