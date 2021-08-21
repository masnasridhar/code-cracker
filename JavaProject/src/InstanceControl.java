class Parent1{
	{
		System.out.println("parent instance 1");
	}
	Parent1(){
		System.out.println("parent:"+j);
	}
	{
		System.out.println("parent instance 2");
		m1();
	}
	int j=20;
	void m1()
	{
		System.out.println(j);
	}
}

public class InstanceControl extends Parent1 {

	int i=0;
//	int j=30; takes this value ,if not then parent
	{
		System.out.println("child instance 1:"+j);
	}
	InstanceControl(){
		System.out.println("child");
	}
	public static void main(String args[]) {
		InstanceControl i=new InstanceControl();
		System.out.println("-------");
		InstanceControl j=new InstanceControl();
	}

	{
		System.out.println("child instance 2");
	}
}
