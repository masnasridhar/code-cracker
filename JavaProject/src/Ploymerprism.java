import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Parent{
	int i=0;
	Parent() throws FileNotFoundException{
		
	}
	public void method() throws IOException {
		System.out.println("parent:"+i);
	}
	//private and static methods cannot be overrided(seems overrided but not) and private method can not be called using parent class reference variable
	private void method2()  {
		System.out.println("parent:"+i);
	}
	private void message(){System.out.println("hello reflection"); }  
}
class Child extends Parent implements Cloneable{
	int i=1;
	Child() throws Exception{
		
	}
	public void method() throws FileNotFoundException {
		System.out.println("child:"+i);
	}
	public void method1() {
		System.out.println("child:"+i);
	}
	private void method2()  {
		System.out.println("parent:"+i);
	}
	void m()throws ArithmeticException{  
		throw new ArithmeticException("sorry");  
		}  
}


public class Ploymerprism implements Cloneable {

	public static void main(String args[]) throws Exception {
		reflection(Ploymerprism.class.getName());
		Ploymerprism pp=new Ploymerprism();
		pp.clone();//need to implement cloneable interface but no need to override clone method 
		Parent p=new Parent();
		p.method();//parent method
		System.out.println(p.i);//parent variable
		Child c=new Child();
		try {
			c.m();
		}
		catch(Exception e) {
			e.getMessage();//To get Description
			e.toString();//To get Exception class Name:Description
			e.printStackTrace();//To get Exception class Name:Description,Stacktrace
		}
		//c.clone();//protected method ,so need to impliment clonable interface and can be called using child class ref(not parent ref)
		//The method clone() from the type Object is not visible because clone is protected method of object but Child class is default so can not inherit
		c.method();//child method
		System.out.println(c.i);//child variable
		//can not override variables only methods
		Parent p1=new Child();
		p1.method();//child method
		System.out.println(p1.i);//parent variable
//		p1.method1();//child method should present in parent then only through parent class reference it can call child method otherwise C.T error
//		Child c1=new Parent();child reference can not hold parent class object
	}
	/*protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}*/

	private static void reflection(String string) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		 Class c=Class.forName("Parent");  
		 
		    Object o= c.newInstance();  
		    Method m1 =c.getDeclaredMethod("message", null);  
		    m1.setAccessible(true);  
		    m1.invoke(o, null);  
	      
		    System.out.println("Fields........");  
		    Field f[]=c.getDeclaredFields();  
		    for(int i=0;i<f.length;i++)  
		        System.out.println(f[i]);  
		      
		    System.out.println("Constructors........");  
		    Constructor con[]=c.getDeclaredConstructors();  
		    con[0].setAccessible(true);
		    for(int i=0;i<con.length;i++)  
		        System.out.println(con[i]);  
		      
		        System.out.println("Methods........");  
		    Method m[]=c.getDeclaredMethods();  
		    for(int i=0;i<m.length;i++)  {
		    	m[0].setAccessible(true);
//		    	m[i].invoke(obj, args);
		        System.out.println(m[i]);  
		    }
		   }  
		
}
