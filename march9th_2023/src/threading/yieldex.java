package threading;
	

	class mythread extends Thread{
		public void run() {
			System.out.println("Hello from Thread"+" "+Thread.currentThread().getName());
		}
	}

	public class yieldex {
	    public static void main(String args[]) {
	        Thread t1 = new Thread();
	        Thread t2 = new Thread();
	 
	        t1.start();
	        t2.start();
	        
	        for (int i = 0; i < 3; i++) {
	            Thread.yield();
	            System.out.println("Hello from Thread"+" "+Thread.currentThread().getName());
	        }
	    }
	}




