class Program26{
	public static void main(String[] args){
		int no=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4-i+1;j++){
				if(j%2!=0){
					System.out.print(no++ +" ");
				}else{
					System.out.print(no*no++ +" ");
				}
			}
			System.out.println();
		}
	}
}
