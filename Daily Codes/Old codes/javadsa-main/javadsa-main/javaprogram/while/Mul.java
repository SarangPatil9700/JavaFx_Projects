class Mul{
	public static void main(String[] args){
		int no=135;
		int mul=1;
		while(no!=0){
			mul=mul*(no%10);
			no=no/10;
		}
		System.out.println(mul);
	}
}
