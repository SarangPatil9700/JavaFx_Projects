class Program23{
	public static void main(String[] args){
		int no=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				if(j%2!=0)
				 {
					 int ans=no*no;
                                        System.out.print(ans +" ");
                                 }else{
					

					System.out.print(no +" ");

				}
				no++;
				
			}
			System.out.println();
		}
	}
}
