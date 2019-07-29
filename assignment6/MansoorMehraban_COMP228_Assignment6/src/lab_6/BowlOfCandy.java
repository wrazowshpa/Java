package lab_6;

import java.util.ArrayList;
import java.util.List;

public class BowlOfCandy {
	private List<String> bowlWithCandy;

	public BowlOfCandy() {
		bowlWithCandy = new ArrayList<String>();
	}

	//TODO make the method below - takeCandy() synchronized
	public synchronized void takeCandy(String candyName) throws InterruptedException {
		while (bowlWithCandy.size() == 0) {
			System.out.println("the bowl is empty: " + bowlWithCandy.size() + " " + Thread.currentThread().getName()
					+ " is going to wait.");
			System.out.println();
			//TODO make the thread hold until it is notified by another thread that it can continue to work
			wait();
		}
		removeCandyFromTheBowl(candyName);
		// TODO let the other thread know that it is ok to do the work on this object now
		notify();
		System.out.println(Thread.currentThread().getName() + " has notified the other thread.");
		System.out.println();
	}

	//TODO make the method below - refillCandy synchronized
	public synchronized void refillCandy(List<String> packOfCandy) throws InterruptedException {
		while (bowlWithCandy.size() == 3 && packOfCandy.size() > 0) {
			System.out.println("the bowl is full" + Thread.currentThread().getName() + " is going to wait.");
			System.out.println();
			//TODO make the thread hold until it is notified by another thread
			wait();
		}
		if(bowlWithCandy.size() == 0 && packOfCandy.size() == 0 ){
			throw new RuntimeException("Sorry! No more candy available!");
		}
		
		addCandyToTheBowl(packOfCandy);
		// TODO let the other thread know that it is ok to do the work on this object now
		notify();
		System.out.println(Thread.currentThread().getName() + " has notified the other thread.");
		System.out.println();
	}

	private void addCandyToTheBowl(List<String> packOfCandy) {
		int numOfCandyRefilled = 0;
		System.out.println("candy in the pack before refill " + RestaurantUtils.getListOfCandy(packOfCandy));
		System.out.println("candy in the bowl before refill " + RestaurantUtils.getListOfCandy(bowlWithCandy));
		if (!bowlWithCandy.contains(Candy.M_N_M)) {
			numOfCandyRefilled += addCandyMnMIfThereIsAny(packOfCandy);
		}
		if (!bowlWithCandy.contains(Candy.BOUNTY)) {
			numOfCandyRefilled += addCandyBountyIfThereIsAny(packOfCandy);
		}
		if (!bowlWithCandy.contains(Candy.ALBENI)) {
			numOfCandyRefilled += addCandyAlbeniIfThereIsAny(packOfCandy);
		}
		System.out.println("refilled " + numOfCandyRefilled + " by " + Thread.currentThread().getName());
		System.out.println("candy in the pack after refill " + RestaurantUtils.getListOfCandy(packOfCandy));
		System.out.println("candy in the bowl after refill " + RestaurantUtils.getListOfCandy(bowlWithCandy));
	}

	private int removeCandyFromTheBowl(String candyName) {
		boolean candyFound = false;
		for (String candy : bowlWithCandy) {
			if (candy.equalsIgnoreCase(candyName)) {
				System.out.println("the candy " + candyName + " is being taken by " + Thread.currentThread().getName());
				bowlWithCandy.remove(candy);
				candyFound = true;
				return 1;
			}
		}
		if (!candyFound) {
			if (bowlWithCandy.size() >= 1) {
				System.out.println(
						"the candy " + bowlWithCandy.get(0) + " is being taken by " + Thread.currentThread().getName());
				bowlWithCandy.remove(0);
				candyFound = true;
				return 1;
			}
		}
		System.out.println("candy taken from the bowl: " + candyFound + " by " + Thread.currentThread().getName());
		return 0;
	}

	public int addCandyMnMIfThereIsAny(List<String> packOfCandy) {
		if (packOfCandy.contains(Candy.M_N_M)) {
			packOfCandy.remove(Candy.M_N_M);
			bowlWithCandy.add(Candy.M_N_M);
			return 1;
		} else {
			System.out.println("the pack is out of m&m");
			return 0;
		}
	}

	public int addCandyBountyIfThereIsAny(List<String> packOfCandy) {
		if (packOfCandy.contains(Candy.BOUNTY)) {
			packOfCandy.remove(Candy.BOUNTY);
			bowlWithCandy.add(Candy.BOUNTY);
			return 1;
		} else {
			System.out.println("the pack is out of bounty");
			return 0;
		}
	}

	public int addCandyAlbeniIfThereIsAny(List<String> packOfCandy) {
		if (packOfCandy.contains(Candy.ALBENI)) {
			packOfCandy.remove(Candy.ALBENI);
			bowlWithCandy.add(Candy.ALBENI);
			return 1;
		} else {
			System.out.println("the pack is out of albeni");
			return 0;
		}
	}
}
