class P  {
	int i = 888;
}
class C extends P {
	int i = 999;//if not present the all the classes will get parent value
}

public class VariableOverriding extends C {
	public static void main(String arg[]) {
		VariableOverriding l=new VariableOverriding();
		System.out.println(l.i);
		P p = new P();
		Case1: System.out.println(p.i); // 888
		C c = new C();
		Case2: System.out.println(c.i); // 999
		P p1 = new C();
		Case3: System.out.println(p1.i); // 888
	}
}