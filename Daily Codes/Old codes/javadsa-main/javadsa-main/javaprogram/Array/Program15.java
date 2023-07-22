//Sum Of Odd elements
import java.util.*;
class Program15{
        public static void main(String[] args){
                int count=0,sum=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Array Size");
                int size=sc.nextInt();
                int arr[]=new int[size];
                System.out.println("Enter Elements");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                for(int i=0;i<arr.length;i++){
                if(arr[i]%2!=0){
                        count++;
			sum=sum+arr[i];
                }
                }
                System.out.println("Sum of odd nos="+sum);
        }
}
