class Program1{
	public static void main(String[] args){
		StringBuffer str1=new StringBuffer("Suyash");
		System.out.println(System.identityHashCode(str1));
		str1.append("Gharge");
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
	}
}
