class MyThread extends Thread{
	MyThread(String str){
		super(str);
	}
	MyThread(){

	}
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}
}
class ThreadDemo1{
	public static void main(String[]args)throws InterruptedException{
		MyThread obj= new MyThread("Sarang");
		Thread t= Thread.currentThread();
		obj.start();

		MyThread obj1= new MyThread("XYZ");
		MyThread obj2= new MyThread("PQR");
		MyThread obj3= new MyThread();  //Thread-0

		obj1.start();
		obj2.start();
		obj3.start();
		
		System.out.println(t.getName());
	}
}

