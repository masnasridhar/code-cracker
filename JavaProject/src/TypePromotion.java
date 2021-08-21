class TypePromotion
{
public void m1()
{
System.out.println("no-args");
}
public void m1(int i){
System.out.println("int-args"+i);
}
public void m1(float f)
{
System.out.println("float-args"+f);
}
public void m1(int i, float f)
{
System.out.println("int, float");
}
public void m1(float f, int i)
{
System.out.println("float, int");
}
public void m1(double f, float i)
{
System.out.println("double, int");
}
public static void main(String[] args)
{
//byte-->short-->int or char-->int-->long -->float-->	double
TypePromotion t = new TypePromotion();
t.m1();
t.m1(10);
t.m1(10l);
t.m1(10f);
t.m1('a');
t.m1(10.0, 5);//doble called
//t.m1(10.5);double can not be called bcz no double method
//t.m1(10, 10); // C.E : reference to m1() is ambiguous
//t.m1(10.5f, 10.5f);// C.E : can’t find symbol method m1(float,float)
}
}