package lab_6;

import java.security.SecureRandom;
import java.util.List;

public class Waiter implements Runnable {

	private static final SecureRandom generator = new SecureRandom();

	List<String> packOfCandy;
	BowlOfCandy bowlOfCandy;

	public Waiter(List<String> packOfCandy, BowlOfCandy bowlOfCandy) {
		super();
		this.packOfCandy = packOfCandy;
		this.bowlOfCandy = bowlOfCandy;
	}

	public void executeMyTask() {
		for (int i = 0; i <10;i++) {
			try // sleep 0 to 3 seconds, then attempt to refill
			{
				int sleepTime = generator.nextInt(3000);
				 System.out.println("thread " +
				 Thread.currentThread().getName() + " is goint to sleep for "
				 + sleepTime);
				 Thread.sleep(sleepTime); // random sleep
				System.out.println("thread " + Thread.currentThread().getName() + " is goint to try to refill candy "
						+ RestaurantUtils.getListOfCandy(packOfCandy));
				bowlOfCandy.refillCandy(packOfCandy);
			} catch (InterruptedException e){
				Thread.currentThread().interrupt();
			}
			catch (RuntimeException e) {
				System.err.println(e.getMessage() + " The program will terminate. ");
				System.exit(0);
			}
		}
	}

	@Override
	public void run() {
		// TODO this is the method that must contain the task. find the code that is the task for this class and place it here
		executeMyTask();
	}
}
