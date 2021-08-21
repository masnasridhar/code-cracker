public class Identifier
{
public static void main(String[] args)
{
String Integer= "10";
//byte b = 130;//can not convert int to byte,down cast not possible
System.out.println(Integer);
int x=012;//octal 2*8^0+8^1
System.out.println(x);
int y=0x11;//hexa 16^0+16^1
System.out.println(y);//hexa 16^0+16^1
//only $ and _ allowed in variable name ,no other symbols

float z=11.5f;
System.out.println(z);

double l=11.5d;
System.out.println(l);
float f = 0x123;//3+32+16^2==291.0
System.out.println(f);

char ch = 97;
System.out.println(ch); //o/p:a and ch='abc' not allowed

ch = '\u0061';
System.out.println(ch);
ch = '\uface';
System.out.println(ch);

}
public static void y() {
	int x;
//	System.out.println(x);
}
}
class Id
{
public static void main(String[] args)
{
String Integer= "10";
//byte b = 130;
System.out.println(Integer);
int x=011;//octal 8^0+8^1
System.out.println(x);
int y=0x11;//octal 8^0+8^1
System.out.println(y);//hexa 16^0+16^1
//only $ and _ allowed in variable name ,no other symbols

float z=11.5f;
System.out.println(z);

double l=11.5d;
System.out.println(l);
float f = 0x123;
System.out.println(f);

char ch = 97;
System.out.println(ch); //o/p:a and ch='abc' not allowed

ch = '\u0061';
System.out.println(ch);
ch = '\uface';
System.out.println(ch);

}
public static void y() {
	int x;
//	System.out.println(x);
}
}