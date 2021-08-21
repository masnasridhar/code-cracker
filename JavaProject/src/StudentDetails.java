
public class StudentDetails  {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean equals(Object o) {
		if(this==o)
			return true;
		if(!(o instanceof StudentDetails))
			return false;
		StudentDetails o1=(StudentDetails)o;
		return o1.id==this.id;
	}
	public int hashCode() {
		return this.id;
		
	}

	/*@Override
	public int compareTo(StudentDetails o) {
		return o.name.compareTo(this.name);
	}*/

}
