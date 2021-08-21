class OverloadingCalculation1 {
	

	void sum(double a, int b) {
		System.out.println(a * b );
	}
	void sum(int a, double b) {
		System.out.println(a + b);
	}

	public static void main(String args[]) {
		OverloadingCalculation1 obj = new OverloadingCalculation1();
		obj.sum(20, 2);// now second int literal will be promoted to long

	}
}