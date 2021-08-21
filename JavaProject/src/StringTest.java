
public class StringTest {

	public StringTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		StringBuilder b = new StringBuilder("hi");//have more updates and not require thread-safe
		String ssss="hi";
		System.out.println(b.toString()==ssss);
		System.out.println(b.toString().intern()==ssss);
		String s1=new String("hi");
		String s = "hi";
		System.out.println("ffffffffff");
		System.out.println(s1==s);
		System.out.println(s == b.toString());
		System.out.println(s == b.toString().intern());
		System.out.println(s1.intern()==b.toString().intern());

		String s11 = new String("raju");
		String concat = s11.concat("Lesto");
		String s22="rajuLesto";
		System.out.println("kkkk:");
		System.out.println(concat.intern()==s22);
				
		String s111 = "spring";
		final String s2 = s111+"summer";
		String x="springsummer";
		System.out.println("dddddddd");
		System.out.println(s2==x);//concat happend
		System.out.println(s2.intern()==x);
		s111.concat("fall");
		s2.concat(s111);
		s111=s111+"winter";
		System.out.println(s111);
//		Because of some runtime operation(append,toLowerCase()), if a String object is required to create it should always create on the heap only.		
		String xx="ABC";
		System.out.println(xx==xx.toLowerCase());

//		Because of some runtime operation, if there is no change in the content then new object won’t be created Ex:"abc".toLowerCase();
		String xxx="abc";
		System.out.println(xxx==xxx.toLowerCase());
		//check final String x="aaa";String y=x+"ll";String z="aaall";System.out.println(x==z);

	}

}
