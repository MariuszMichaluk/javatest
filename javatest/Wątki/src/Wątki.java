
public class Wątki {

	public static void main(String[] args) {
		Wątki w = new Wątki();
		Runnable[] runners = new Runnable[10];
		Thread[] threads = new Thread[10];
		
		for(int i = 0; i < 10; ++i) {
			runners[i] = new MyRun(i, w);
			threads[i] = new Thread(runners[i]);
			threads[i].start();
		}
		while(true) {
		    try {
		        Thread.sleep(1000);
		    }
		    catch(InterruptedException e) {
		    }
		
		    synchronized(w) {
			    w.notify();
		    }
		}

	}

}
