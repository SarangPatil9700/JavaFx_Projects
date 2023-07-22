import java.io.*;
class Program3{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Player Name");
		String name=br.readLine();
		System.out.println("Enter Jer No");
		int no=Integer.parseInt(br.readLine());
		System.out.println("Enter Average");
		float avg=Float.parseFloat(br.readLine());
		System.out.println(name);
		System.out.println(no);
		System.out.println(avg);
	}
}
