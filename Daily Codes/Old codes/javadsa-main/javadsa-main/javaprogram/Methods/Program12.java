class Program12{
        int a=10;//Global
	public static void main(String[] args){
		Program12 obj=new Program12();
		int b=20;//Local
		System.out.println(b);
		System.out.println(a);
	}
}
