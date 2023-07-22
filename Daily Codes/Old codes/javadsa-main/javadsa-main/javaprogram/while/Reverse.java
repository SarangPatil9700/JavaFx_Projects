class Reverse{
	public static void main(String[] args){
		int rev=0;
		int no=6531;
		while(no!=0){
			rev=rev*10+no%10;
			no=no/10;
		}
		System.out.println(rev);
	}
}
