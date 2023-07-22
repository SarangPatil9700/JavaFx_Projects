class Gym{
	String gymName="Traps";
	int gymFees=5000;
	void Customer(){
		String customerName="Dinesh";
		int customerid=8844;
		System.out.println("Gym Name:"+gymName);
		System.out.println("Gym Fees:"+gymFees);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Customer Id:"+customerid);
	}
}
class Fitness{
	public static void main(String[] args){
		Gym obj=new Gym();
		obj.Customer();
	}
}
       
