import java.util.*;
class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Nos");
		int arr[]=new int[5];
		/*arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();
		arr[3]=sc.nextInt();
		arr[4]=sc.nextInt();*/
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
	        }
		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		}
	}
}
