import java.io.*;
import java.util.*;
class Program8{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Society Name,Wing,Flat no,Flat Tax");
                String Info=br.readLine();
                System.out.println(Info);
                StringTokenizer obj=new StringTokenizer(Info," ");
                String token1=obj.nextToken();
                String token2=obj.nextToken();
                int token3=Integer.parseInt(obj.nextToken());
		float token4=Float.parseFloat(obj.nextToken());
                char wing=token2.charAt(0);
                System.out.println("Society="+token1);
                System.out.println("Wing="+wing);
                System.out.println("Flat no="+token3);
		System.out.println("Flat tax="+token4);
        }
}
