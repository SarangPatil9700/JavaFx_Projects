import java.util.*;
class Program33{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter 2D array size:");
                int rows=sc.nextInt();
                int cols=sc.nextInt();
		System.out.println("Enter Elements in Array");
                int arr[][]=new int[rows][cols];
                for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                                arr[i][j]=sc.nextInt();
                        }
                }
                for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                                System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();
                }
        }

}
