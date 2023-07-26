class MyThread extends Thread{
	MyThread(String str){
		super(str);
	}
	public void run(){
		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}
class ThreadGroupDemo{
	public static void main(String[]args){
		MyThread obj=new MyThread("xyz");
		MyThread obj1=new MyThread("PQR");

		obj.start();
		obj1.start();

	}
}
