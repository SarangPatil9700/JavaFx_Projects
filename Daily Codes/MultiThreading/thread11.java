//IMP CODE
class MyThread implements Runnable{

	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			
			System.out.println(ie.toString());
		}
	}
}
class ThreadGroupDemo{
	public static void main(String[]args) throws InterruptedException{

		ThreadGroup pThreadGP = new ThreadGroup("India");

		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();

		Thread t1 = new Thread(pThreadGP,obj1,"Maha");
		Thread t2 = new Thread(pThreadGP,obj2,"Goa");

		t1.start();
		t2.start();

		ThreadGroup cThreadGP = new ThreadGroup(pThreadGP,"Pakistan");

		MyThread obj3 = new MyThread();
		MyThread obj4 = new MyThread();

		Thread t3 = new Thread(cThreadGP,obj3,"Karachi");
		Thread t4 = new Thread(cThreadGP,obj4,"Lahore");

		t3.start();
		t4.start();

		ThreadGroup cThreadGP2 = new ThreadGroup(pThreadGP,"Bangladesh");

		MyThread obj5 = new MyThread();
		MyThread obj6 = new MyThread();

		Thread t5 = new Thread(cThreadGP2,obj5,"Dhaka");
		Thread t6 = new Thread(cThreadGP2,obj6,"Mirpur");

		t5.start();
		t6.start();
	}
}
