interface Demo{

	static void fun(){
		System.out.println("In Fun-Demo");
	}

	default void gun(){
		System.out.println("In gun-Demo");
	}
}
