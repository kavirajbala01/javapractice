package threading;

public class exampletwo extends Thread {
	
	 public synchronized void run () {
		 System.out.println("Hello from Thread"+" "+Thread.currentThread().getName());
	 }
	 public static void main(String[]args) {
			exampletwo t1 = new exampletwo();
			exampletwo t2 = new exampletwo();
			exampletwo t3 = new exampletwo();
			exampletwo t4 = new exampletwo();
			exampletwo t5 = new exampletwo();
			exampletwo t6 = new exampletwo();
			
			t1.start();
			t1.setPriority(7);
			t2.start();
			t2.setPriority(7);
			t3.start();
			t3.setPriority(7);
			t4.start();
			t4.setPriority(10);
			t5.start();
			t5.setPriority(6);
			t6.start();
			t6.setPriority(NORM_PRIORITY);
			
			System.out.println("priority of t1 "+ t1.getPriority());
			System.out.println("priority of t2 "+ t2.getPriority());
			System.out.println("priority of t3 "+ t3.getPriority());
			System.out.println("priority of t4 "+ t4.getPriority());
			System.out.println("priority of t5 "+ t5.getPriority());
			System.out.println("priority of t6 "+ t6.getPriority());
	 }

}
