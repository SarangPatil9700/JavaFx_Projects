import java.util.*;
class Program8{
	static int myStrLen(String str){
                char arr[]=str.toCharArray();
                int count=0;
                for(int i=0;i<arr.length;i++){
                        count++;
                }
                return count;
        }
	public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
	  System.out.println("Enter 1st String");
	  String str1=sc.next();
	  System.out.println("Enter 2nd String");
	  String str2=sc.next();
	  if(myStrLen(str1)==myStrLen(str2)){
		  System.out.println("Length are same="+str1);
	  }else{
		  System.out.println("Length are not same="+str2);
	  }
	}
}

	  
