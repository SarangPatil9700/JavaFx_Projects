class Break1{
	public static void main(String[] args){
		int no=15;
		int cnt=0;
		for(int i=1;i<=no;i++){
			if(no%i==0){
				cnt++;
			}
			if(cnt>2){
				break;
			}
		}
		if(cnt==2){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
	
	}
}

