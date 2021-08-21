
public class EQHC {

	public static void main(String[] args) {
		Student s=new Student();
		s.id=10;
		Student s1=new Student();
		s1.id=10;
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode()+":"+s1.hashCode());
		//So you should override hashCode when you override equals method

	}

}
class Student{
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public boolean equals(Object s) {
		if(this==s)
			return true;
		if(!(s instanceof Student))
			return false;
		Student ss=(Student)s;
		return Integer.compare(id, ss.id)==0;
		
	}
	public int hashCode() {
		return this.id;
		
	}
	
}
