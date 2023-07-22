/*
method 3:public synchronized StringBuffer delete(int start,int end);
*/
class Method3{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("Core2Web");
		sb.delete(2,7);
		System.out.println(sb);
	}
}
