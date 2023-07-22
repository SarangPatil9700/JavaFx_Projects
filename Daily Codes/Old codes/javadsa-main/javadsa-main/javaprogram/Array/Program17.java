//Product of Odd Elements
import java.util.*;
class Program17{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int count=0;int mul=1;
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
                         mul=mul*arr[i];
                }
                }
                System.out.println("Mul is="+mul);
              }

}
