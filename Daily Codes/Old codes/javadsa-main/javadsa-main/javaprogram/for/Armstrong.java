class Armstrong{
	public static void main(String[] args){
		int no=153;
		int sum=0;
		int t1=no;
		int t2=no;
		int cnt=0;
		while(no!=0){
			cnt++;
			no=no/10;
		}
		while(t1!=0){
			int rem=t1%10;
			int mul=1;
			for(int i=1;i<=cnt;i++){
				mul=mul*rem;
			}
			sum=sum+mul;
			t1=t1/10;
		}
		if(t2==sum){
			System.out.println("Armstrong");
		}else{
			System.out.println("Not Armstrong");
		}
	}
}
