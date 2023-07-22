class Society{
	int flatNo=504;
	static String societySpace="Garden";
	void Info(){
		System.out.println("Flat no="+flatNo);
	        System.out.println("Society Space="+societySpace);
	}
}	
class Members{
	public static void main(String[] args){
		Society obj1=new Society();
		Society obj2=new Society();
		
		obj1.Info();
		obj2.Info();

		System.out.println("------------------------------");

		obj2.flatNo=304;
		obj2.societySpace="Club House";

	        obj1.Info();
                obj2.Info();
	}
}
