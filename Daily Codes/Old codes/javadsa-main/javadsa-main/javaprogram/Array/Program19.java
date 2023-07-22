// Divisible by 5
import java.util.*;
class Program19{
        public static void main(String[] args){
		int count=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Array Size");
                int size=sc.nextInt();
                int arr[]=new int[size];
                System.out.println("Enter Elements");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0){
		         System.out.println("Divisible is="+arr[i]);       
		}
		 
		}
		}
       
}

