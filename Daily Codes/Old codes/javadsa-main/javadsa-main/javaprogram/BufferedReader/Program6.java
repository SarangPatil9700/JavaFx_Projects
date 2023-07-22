import java.io.*;
class Program6{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println("String="+str);
		br.close();

		char ch=(char)isr.read();
		System.out.println("char="+ch);
	}
}
