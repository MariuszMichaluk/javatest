public class MyRun implements Runnable {
	private int id;
	private Wątki w;

	public MyRun(int id, Wątki w) {
		this.id = id;
		this.w = w;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Watek "+id);
			try {
				synchronized(w) {
					w.wait();
				}
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}