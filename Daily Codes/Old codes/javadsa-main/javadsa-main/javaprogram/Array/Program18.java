//Vowels 
import java.io.*;
class Program18{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreanReader(System.in);
		BufferedReader br=new BufferedReader(r);
		char arr[]={'a','b','c','o','d','p','e'};
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
				System.out.println(arr[0]);
			}
		}
	}
}
