public class RunClass {
	public static void main(String[] args) {
		func(10);
		func(10.1);
		func(10l);
	}

	private static void func(double d) {
		int x=10;
		int y=20;
		
	}
	private static void func(float a) {
		int x=10;
		int y=20;
		
	}
	private static void func(int a,int b) {
		int x=30;
	}
	private static void func(float a,int b) {
		int x=30;
	}

	private static void func(int a,float b) {
		int x=30;
	}

	private static void func(float a,float b) {
		int x=30;
	}

}
