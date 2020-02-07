package variable;

public class ThreadTest {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T1 t2 = new T1();
		t1.start();
		t2.start();
		R1 r1 = new R1();
		Thread t3 = new Thread(r1);
		t3.start();
	}
	static class T1 extends Thread{
		@Override
		public void run() {
			Thread t = Thread.currentThread();
			String name = t.getName();
			for (int j = 0; j < 100; j++) {
				
				System.out.println(name+"-"+j);
			}
		}
	}
	static class R1 implements Runnable{

		@Override
		public void run() {
			Thread t = Thread.currentThread();
			String name = t.getName();
			for (int i = 0; i < 100; i++) {
				System.out.println(name+"-"+i);
			}
		}
		
	}
	
}
