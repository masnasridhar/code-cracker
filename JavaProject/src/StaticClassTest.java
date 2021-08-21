
 class StaticClass {

	public StaticClass() {
		System.out.println("parent-constr first");
	}
	public static void staticMethod() {
		System.out.println("parent");
	}
	public static final void method1() {
		System.out.println("static final");
	}
	public void finalOverride() {
		System.out.println("non");
	}
	public void onlyParent() {
		System.out.println("only parent");
	}

}
 public class StaticClassTest extends StaticClass {

	public StaticClassTest() {
		System.out.println("child-constr next");
	}
	//A static method can’t be overridden as non-static.
	public static void staticMethod() {
		System.out.println("child");
	}
	//parentRef.staticMethod1() method can not be called with parent class reference if not present in parent class
	public static void staticMethod1() {
		System.out.println("child1");
	}
	//non-final ==> final override possible
	public final void finalOverride() {
		System.out.println("final");
		
	}
	//final methods can be inherited but not overrided
	/*public static final void method1() {
		System.out.println("static final");
	}*/
	public static void main(String args[]) {
		StaticClass s=new StaticClassTest();
		s.staticMethod();//overriding is not applicable for static methods but seems to be overriding is possible, but it is method hiding.
		s.method1();
		s.finalOverride();
		s.onlyParent();
	}

}

