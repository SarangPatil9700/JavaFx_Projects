class Program19{
	public static void main(String[] args){
		int no=10;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(no+" ");
				no--;
			}
			System.out.println();
		}
	}
}
