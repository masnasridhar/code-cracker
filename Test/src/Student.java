
public class Student {
	//instance variables
	private String name;
	private int rollNumber;
	private static String collageName;//static variable
	
	
	//constructor
	public Student() {
		super();//by default calls super class constructor 
		//instance blocks executed here
//		name="s1";
//		rollNumber=1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "Mr."+name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public static String getCollageName() {
		return collageName;
	}
	public static void setCollageName(String collageName) {
		Student.collageName = collageName;
	}
	public void printDetails()
	{
		System.out.println("name: "+name+" , rol No:"+rollNumber);
	}
	
	/*{
		name="sss1";
		System.out.println(name);
	}
	
	{
		name="sss2";
		System.out.println(name);
	}*/
}
