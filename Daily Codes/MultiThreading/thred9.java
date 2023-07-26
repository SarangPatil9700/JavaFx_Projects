//Creating parent and child Thread(ThreadGroup)
class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadGroupDemo{
	public static void main(String[]args){

		ThreadGroup pthreadGP=new ThreadGroup("Core2web");

		MyThread obj1= new MyThread(pthreadGP,"C");
		MyThread obj2= new MyThread(pthreadGP,"Java");
		MyThread obj3= new MyThread(pthreadGP,"Python");

		obj1.start();
		obj2.start();
		obj3.start();

		ThreadGroup cthreadGP=new ThreadGroup(pthreadGP,"Incubator");

		MyThread obj4= new MyThread(pthreadGP,"Flutter");
		MyThread obj5= new MyThread(pthreadGP,"ReactJS");
		MyThread obj6= new MyThread(pthreadGP,"Springboot");

		obj4.start();
		obj5.start();
		obj6.start();
	}
}

