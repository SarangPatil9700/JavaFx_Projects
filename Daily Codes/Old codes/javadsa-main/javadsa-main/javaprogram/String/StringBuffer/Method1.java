/*
method1:public synchronized StringBuffer(String str);
*/

class Method1{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("Suyash");
		System.out.println(sb);

		sb.append("Gharge");
		System.out.println(sb);
	}
}
