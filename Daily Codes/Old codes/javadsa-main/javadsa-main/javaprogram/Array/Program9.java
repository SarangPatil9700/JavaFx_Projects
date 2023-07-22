import java.io.*;
class Program9{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 5 nos");
	       	int arr[]=new int[5];
	/*	arr[0]=Integer.parseInt(br.readLine());
		arr[1]=Integer.parseInt(br.readLine());
		arr[2]=Integer.parseInt(br.readLine());
		arr[3]=Integer.parseInt(br.readLine());
		arr[4]=Integer.parseInt(br.readLine()); */
		for(int i=0;i<5;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		}
	}
}

