@FunctionalInterface
interface I{
	@Override
	boolean equals(Object obj);//can declare object class methods as abstract methods
	void abstarctMethod();//should have one actual abstract methods for functional interface
	default void x() {
		System.out.println("I");
	}
	//default methods can not override a method from java.lang.Object 
	/*default boolan equals(Object o) {
		return true;
	}*/
}
interface J{
	default void x() {
		System.out.println("J");
	}
}
class K{
	//this method called ,not interface default method
	 public void x() {
		System.out.println("K");
	}
}


public class DefaultMInterface extends K implements I,J {


	public static void main(String[] args) {
		DefaultMInterface d=new DefaultMInterface();
		d.x();
	}
//called when both interfaces impliments same default method and no other class implimented the method.
	/*@Override
	public void x() {
		System.out.println("DefaultMInterface");
	}*/

	@Override
	public void abstarctMethod() {
		
	}

}
