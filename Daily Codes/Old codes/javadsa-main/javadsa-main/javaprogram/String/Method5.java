/*
method5:public int compareToIgnoreCase(String str);
parameter:String
returntype:Integer
*/

class Method5{
	public static void main(String[] args){

		String str1="SHASHI";
		String str2="shashi";
		String str3="shashis";
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str2.compareToIgnoreCase(str3));
	}
}
