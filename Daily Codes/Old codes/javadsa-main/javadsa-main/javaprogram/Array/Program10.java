import java.util.*;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements");
		int arr[]=new int[5];
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
	/*	sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4]; */
		for(int i=0;i<5;i++){
			sum=sum+arr[i];
		}
		System.out.println("Sum of array="+sum);
	}
}
