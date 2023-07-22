class Program13{
        public static void main(String args[]){
		char ch='A';int no=1;
                for(int i=1;i<=3;i++){
                        for(int j=1;j<=4;j++){
                                if(j%2!=0){
                                        System.out.print(ch++);
                                }else{
                                        System.out.print(no++);
                                }
                        }
                        System.out.println();
                }
        }
}
