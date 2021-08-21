
public class Application {

	public Application() {
	}

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="sridhar";
//		s1.setName("sridhar");
		s1.setRollNumber(11);
//		System.out.println(s1.getName());
		s1.printDetails();
		Student s2=new Student();
		s2.setName("sridhar");
		s2.setRollNumber(11);
//		System.out.println(s2.getName());
		s2.printDetails();
		
	}

}
