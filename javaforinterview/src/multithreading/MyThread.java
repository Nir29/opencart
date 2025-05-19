package multithreading;

public class MyThread implements Runnable {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("value of i is="+i);
		}
	}



public static void main(String[]args) {
	MyThread t1= new MyThread();
	Thread th=new Thread(t1);
	th.start();
	
}

}
