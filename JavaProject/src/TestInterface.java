interface InterfaceTest2
{
int i=0;//need intialize because by default public static final
void m1();//public,default,abstarct are the only modifiers
}
interface InterfaceTest1
{
	int i=20;//makes ambiguous
	
void m1();//public,default,abstarct are the only modifiers
}
public class TestInterface implements InterfaceTest2,InterfaceTest1
{
//	need to put public not default
public void m1(){
	System.out.println("test");
	if(true) {
		int i = 10;
	}
	/*if(true)
	int i = 10;gives error so above .one line varibale assignment wil not work*/
}
public void m2(){
	System.out.println("test");
}
public static void main(String args[]) {
	TestInterface s=new TestInterface();
	s.m1();
	System.out.println(InterfaceTest2.i);
//	System.out.println(s.i);ambiguous so use InterfaceTest2.i
}
}