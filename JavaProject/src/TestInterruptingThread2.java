class TestInterruptingThread2 extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
		try {
			
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			System.out.println("Exception handled " + e);
//			throw new RuntimeException("Thread interrupted..."+e);  //if we propagate the exception then it will be stopped
		}
		}
		System.out.println("thread is running...");
	}

	public static void main(String args[]) throws InterruptedException {
		TestInterruptingThread2 t1 = new TestInterruptingThread2();
		t1.start();
		t1.interrupt();
		Thread.sleep(2000);
		System.out.println("------"+t1.isAlive());

	}
}
//To stop the thread make it sleep and interrupt it and the propagate the exception