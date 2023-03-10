//package threading;
//
//public class example extends Thread {
//	public void run () {
//		
//            System.out.println("Hello from Thread"+" "+Thread.currentThread().getName());
//            Thread.yield();
//		}
//		public static void main(String[]args) {
//			example t = new example();
//			
//			t.start();
//			 
//			System.out.println("all threads finished executing");
//		
//		}
//	}
//
//
////package threading;
//
////public class example extends Thread {
////	public void run () {
////		
////            System.out.println("Hello from Thread"+" "+Thread.currentThread().getName());
////           
////		}
////		public static void main(String[]args) {
////			example t1 = new example();
////			example t2 = new example();
////			example t3 = new example();
////			example t4 = new example();
////			
////			t1.start();
////			t1.setPriority(9); 
////			t2.start();
////			t2.setPriority(8);
////			t3.start();
////			t3.setPriority(4);
////			t4.start();
////			t4.setPriority(2);
////			
////			System.out.println("priority of t1 "+ t1.getPriority());
////			Thread.yield();
////			System.out.println("priority of t2 "+ t2.getPriority());
////			Thread.yield();
////			System.out.println("priority of t3 "+ t3.getPriority());
////			Thread.yield();
////			System.out.println("priority of t4 "+ t4.getPriority());
////			Thread.yield();
////		
////		}
////	}
//
//
