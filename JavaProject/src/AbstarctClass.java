
public abstract class AbstarctClass {
	int oo;//instance variable -default initialized
	static int mm;//static varble -default intialized
	final static int yy;//not initialized by default need to initial in static block
	final int lll;//not initialized by default need to initial in instance block or constructor
	{
		lll=0;	
	}
	static {
		yy=0;
	}
	{
		final int bb;//If we are not using local variable then no need of perform initialization even though it is final.
	}
	
	public AbstarctClass() {
		//object will not be created but it is for intialization of member variables
		//Abstract classes have constructors and those constructors are always invoked when a concrete subclass is instantiated
	}
	public abstract void y();
	public final void x() {
		//abstract class can have final methods but  final class can not have abstract methods
	}
	public static void main(String args[])
	{
		final int kk;//For the local variables the only applicable modifier is final.
//		static int uu;//For the local variables the only applicable modifier is only final no static==so CT error.
//		AbstarctClass a= new AbstarctClass(); //abstract class can not be instatiated even after having constructor
	}
	public void staticCheck()
	{
		System.out.println(mm);//static data can be accessed from non static methods but not in reverse way
	}
}
