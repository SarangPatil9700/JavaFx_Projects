/* 
method 2:public synchronized StringBuffer delete(int start,int end);
*/
class Method2{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("ShashiCore2Web");
		System.out.println(sb);
		sb.insert(6,"Bagal");
		System.out.println(sb);
	}
}
