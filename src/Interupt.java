
public class Interupt extends Thread {
	public void run() {
		for (int x = 0; x < 1000; x++) {
			try {
				this.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" That's interesting!... Say something more about");
			
		}
	}
}
