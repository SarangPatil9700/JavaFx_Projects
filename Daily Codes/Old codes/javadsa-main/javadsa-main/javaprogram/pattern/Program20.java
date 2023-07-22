class Program20{
	public static void main(String[] args){
		int no=4;
		for(int i=1;i<=no;i++){
			for(int j=1;j<=no-i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
