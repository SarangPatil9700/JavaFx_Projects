
public class Divisible1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=9;
		if(x%3==0) {
			System.out.println("Fizz");
		}else if(x%5==0) {
			System.out.println("Buzz");
		}
		else if(x%5==0 && x%3==0) {
			System.out.println("Fizz-Buzz");
		}
		else {
			System.out.println("Not divisible by both");
		}
		

	}

}
