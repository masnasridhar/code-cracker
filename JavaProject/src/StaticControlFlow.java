class AB{
	AB(){
		System.out.println("constroctor AB");
	}
	static int i = 50;
	static {
		m1();
		System.out.println("first static block AB");
	}

	private static void m1() {
		System.out.println("AB:"+j);
	}
	static {
		System.out.println("second static block AB");
	}
	static int j=100;
}

public class StaticControlFlow extends AB {

	static int i = 0;
	static {
		m1();
		System.out.println("first static block");
	}

	public StaticControlFlow() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("main");
		AB a=new StaticControlFlow();
		AB b=new StaticControlFlow();
	}

	private static void m1() {
		System.out.println(j);
	}
	static {
		System.out.println("second static block");
	}
	static int j=20;
}
