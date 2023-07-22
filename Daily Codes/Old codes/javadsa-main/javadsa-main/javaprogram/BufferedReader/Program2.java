import java.io.*;
class Program2{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Batsman Name");
		String name1=br.readLine();
		System.out.println("Enter Bouler Name");
		String name2=br.readLine();
		System.out.println("Batsman Name="+name1);
		System.out.println("Bouler Name="+name2);
	}
}
