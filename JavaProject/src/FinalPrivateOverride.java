class A {
	// Private methods are not visible in the child classes.Hence they won’t participate in overriding.
	//final methods can not be override(non-final -->final will work but in reverese)
	  private final void m1() {
System.out.println("A-->m1()");
	}

}

class B extends A {

	 final void m1() {
		System.out.println("B-->m1()");
	}

}

public class FinalPrivateOverride {

	public static void main(String[] args) {
//		A a=new B();method m1 can not be visible to A
		B a=new B();
		a.m1();
	}

}
