class Sum{
	public static void main(String[] args){
		int sum=0;
		int no=6531;
		while(no!=0){
			sum=sum+no%10;
			no=no/10;
		}
		System.out.println(sum);
	}
}
