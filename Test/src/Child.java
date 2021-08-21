
public class Child extends Superclass {
	int i=11;//instance varbiles
	static int y=20;
	public void fun()
	{
		System.out.println("child "+i);
	}
	public static void main(String args[])
	{
		int x=10;
		Child s=new Child();//classname refrencevaribale=new ClassName();\
		s.i=20;
		Child s1=new Child();
		s1.i=30;
		Child s2=new Child();
		s2.i=50;
		s2.i=60;
		s.fun();
		s1.y=77;
		System.out.println(s);
	}

}
