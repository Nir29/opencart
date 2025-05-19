package multithreading;

public class MyAnotherThread extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("value of i is="+i);
		}
	}
	public void main(String[]args) {
		MyAnotherThread mt=new MyAnotherThread();
		mt.start();
	}

}
