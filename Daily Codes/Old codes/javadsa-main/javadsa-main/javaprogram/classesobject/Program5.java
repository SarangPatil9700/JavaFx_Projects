class MacD{
	int count=5;
	String Product="frenchfries";
	void Menu(){
		String menu1="Veg";
		String menu2="Non-Veg";
		System.out.println(Product);
		System.out.println(count);
	}
}
class User{
	public static void main(String[] args){
		MacD obj=new MacD();
		obj.Menu();
	}
}
