class MyClass extends Thread{	// 1. extend the Tread Class
	@Override
	public void run() {
		String sa="";
		for (int i=0; i<10000;i++){
			 sa +="sa";
			//System.out.println(Thread.currentThread().getId()+"value "+i); // to the the thread id
			 }}}
public class Treads {

	public static void main(String[] args) {
		MyClass myThread=new MyClass();
		int startTimer=(int) System.currentTimeMillis();
		myThread.run();	// Need to call the start method only..!
		int endTimer=(int) System.currentTimeMillis();
		
		MyClass myThread1=new MyClass();
		int startTimes=(int) System.currentTimeMillis();
		myThread1.start();
		int endTimes=(int) System.currentTimeMillis();
		int x=endTimer-startTimer;
		int y=endTimes-startTimes;
		System.out.println("the none thread was "+ x);
		System.out.println("the  thread was "+ y);}}
