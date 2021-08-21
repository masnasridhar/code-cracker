import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class HelloHP {
	public static void main(String args[]) throws InterruptedException, BrokenBarrierException {
		CyclicBarrier barrier = new CyclicBarrier(4);
		Party first = new Party(1000, barrier, "PARTY-1");
		Party second = new Party(2000, barrier, "PARTY-2");
		Party third = new Party(3000, barrier, "PARTY-3");
		Party fourth = new Party(4000, barrier, "PARTY-4");
		Party first1 = new Party(1000, barrier, "PARTY-11");
		Party second1 = new Party(2000, barrier, "PARTY-21");
		Party third1 = new Party(3000, barrier, "PARTY-31");
		Party fourth1 = new Party(4000, barrier, "PARTY-41");
		first.start();
		second.start();
		third.start();
		fourth.start();
		first1.start();
		second1.start();
		third1.start();
		fourth1.start();
		System.out.println(Thread.currentThread().getName() + " has finished");
	}
}

class Party extends Thread {
	private int duration;
	private CyclicBarrier barrier;

	public Party(int duration, CyclicBarrier barrier, String name) {
		super(name);
		this.duration = duration;
		this.barrier = barrier;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName() + " is calling await()");
			barrier.await();//await() is a blocking call and it blocks until count reaches zero.
			System.out.println(Thread.currentThread().getName() + " has started running again");
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
