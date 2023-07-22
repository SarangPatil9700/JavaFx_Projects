/*
method4: public synchronized StringBuffer reverse();
*/
class Method4{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("Suyash");
		System.out.println(sb.reverse());
		String str1="Core2Web";
		StringBuffer sb2=new StringBuffer(str1);
		str1=sb2.reverse().toString();
		System.out.println(str1);
	}
}
