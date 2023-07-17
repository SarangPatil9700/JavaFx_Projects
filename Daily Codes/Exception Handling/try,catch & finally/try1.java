class Demo{
	public static void main(String[]args){
		System.out.println("Start main");
		try{
			System.out.println(10/0);	//Risky code
		   }catch(ArithmeticException obj){
			   System.out.println("Exception occured");  //Handling code
		   }
		   System.out.println("End main");
	}
}

