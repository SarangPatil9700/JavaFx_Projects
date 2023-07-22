import java.io.*;
class Program4{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Building Name");
		String name=br.readLine();
		System.out.println("Enter Wing");
		char wing=(char)br.read();
		br.skip(1);
		System.out.println("Enter Flat no");
		int no=Integer.parseInt(br.readLine());
		System.out.println("Building name="+name);
		System.out.println("Wing="+wing);	
		System.out.println("Flat no="+no);
	}
}
