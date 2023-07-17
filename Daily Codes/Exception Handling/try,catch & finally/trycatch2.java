import java.io.*;
class Demo{
	public static void main(String[]args){
		System.out.println("In loop");
		try{
			Thread.sleep(5000);
		}catch(RuntimeException obj){
		}catch(InterruptedException obj){
		}
	}
}
