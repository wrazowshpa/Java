package lab_6;

import java.security.SecureRandom;

public class Customer implements Runnable {

	private static final SecureRandom generator = new SecureRandom();
	int numberOfCustomers = 1 + generator.nextInt(9);

	BowlOfCandy bowlOfCandy;

	public Customer(BowlOfCandy bowlOfCandy) {
		super();
		this.bowlOfCandy = bowlOfCandy;
	}

	
	public void executeMyTask() {
		// each customer will go to the bowl 10 times to take candy
		for (;numberOfCustomers != 0;) {
			// sleep 0 to 3 seconds, take candy
			try {
				int sleepTime = generator.nextInt(3000);
				System.out
						.println("thread " + Thread.currentThread().getName() + " is goint to sleep for " + sleepTime);
				Thread.sleep(sleepTime);
				String candyName = randomlyChooseCandy();
				System.out.println(
						"thread " + Thread.currentThread().getName() + " is goint to try to take candy " + candyName);
				bowlOfCandy.takeCandy(candyName);
			} catch (Exception exception) {
				Thread.currentThread().interrupt();
			}
			numberOfCustomers--;
		}
		if(numberOfCustomers == 0){
			System.err.println("No more customers left. Program will terminate.S");
			System.exit(0);
		}
		
	}

	public String randomlyChooseCandy() {
		int randomCandy = generator.nextInt(3);

		if (randomCandy == 0) {
			return Candy.M_N_M;
		} else if (randomCandy == 1) {
			return Candy.ALBENI;
		} else {
			return Candy.BOUNTY;
		}
	}


	@Override
	public void run() {
		// TODO this is the method that must contain the task. find the code that is the task for this class and place it here
		executeMyTask();
	}
}
