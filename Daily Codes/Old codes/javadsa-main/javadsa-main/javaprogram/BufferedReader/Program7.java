import java.io.*;
import java.util.*;
class Program7{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Society name,Wing,Flat no");
		String Info=br.readLine();
		System.out.println(Info);
		StringTokenizer obj=new StringTokenizer(Info," ");
		String token1=obj.nextToken();
		String token2=obj.nextToken();
		String token3=obj.nextToken();

		System.out.println("Society="+token1);
		System.out.println("Wing="+token2);
		System.out.println("Flat no="+token3);
	}
}
