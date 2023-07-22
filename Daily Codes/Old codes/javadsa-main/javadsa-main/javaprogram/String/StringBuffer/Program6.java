class Program6{
	public static void main(String[] args){
		String str1="Suyash";
		String str2=new String("Gharge");
		StringBuffer str3=new StringBuffer("Core2Web");
		String str4=str1.concat(str3);//StringBuffer cannot converted to string
		StringBuffer str5=str3.append(str1);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
}
