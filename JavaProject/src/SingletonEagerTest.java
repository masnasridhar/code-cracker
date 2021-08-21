import java.io.Serializable;
import java.lang.reflect.Constructor;

import javax.management.RuntimeErrorException;

public class SingletonEagerTest {

//by overriding object readResolve method we can protect singltion from serialization and deserialization
	public static void main(String[] args) {
//		Singleton s=new Singleton();
		try {
			  Class c=Class.forName("Singleton"); //specify class name in quotes - got instance even though we did not use it
			  System.out.println("==========");
			  Class c1=Class.forName("Singleton"); 
		       //----Accessing private constructor
		       Constructor con=c.getDeclaredConstructor();
		       con.setAccessible(true);     
//		       Singleton obj=(Singleton) con.newInstance();//throws exception when try to create a new object
		       Singleton obj=Singleton.getInstance();
		       Singleton obj1=(Singleton) obj.clone();//gets same object even with clone
		       System.out.println(obj.hashCode()+":"+obj1.hashCode());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

 class Singleton implements Cloneable,Serializable {
	private static Singleton singleton=new Singleton();
	private Singleton() {
		if(singleton!=null)
			throw new RuntimeErrorException(null, "singleton");
		System.out.println("constructor: "+this.hashCode());
	}
	public static Singleton getInstance() {
		return singleton;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
		return singleton;
	}
	 Singleton readResolve() {
		System.out.println("serialize readResolve");
		return singleton;//after de-serializing called this this method
	}
	

}
