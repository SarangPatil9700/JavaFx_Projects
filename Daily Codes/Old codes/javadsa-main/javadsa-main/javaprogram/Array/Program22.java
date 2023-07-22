// Passing Array as an Argument
class Program22{
	public static void main(String[] args){
		Program22 obj=new Program22();
		int ret=obj.fun(10);
		System.out.println(ret);
	}
	int fun(int x){
		int val=x+50;
		return val;
	}
}
