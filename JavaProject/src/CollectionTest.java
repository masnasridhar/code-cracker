import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
//		Integer k=3;
		l.add(3);
		l.add(1);
		System.out.println(l.add(null));
//		l.forEach(System.out::println);
		l.forEach(i->System.out.println(i));
		l.remove(new Integer(3));
		l.forEach(i->System.out.println(i));
		StudentDetails s1=new StudentDetails();
		s1.setId(1);
		s1.setName("s1");
		StudentDetails s2=new StudentDetails();
		s2.setId(2);
		s2.setName("s2");
		StudentDetails s3=new StudentDetails();
		s3.setId(1);
		s3.setName("s1");
		List<StudentDetails> ls=new ArrayList<StudentDetails>();
		ls.add(s1);
		ls.add(s2);
		ls.remove(s3);
		ls.forEach(i->System.out.println(i.id+":"+i.name));
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(2);
		ll.add(1);
		ll.forEach(i->System.out.println(i));
		
		Set<StudentDetails> s=new HashSet<>();
		s.add(s1);
		s.add(s2);
		System.out.println(s.add(s3));
		Set ss=new HashSet();
		ss.add(1);
		ss.add(0);
		ss.add(null);
		ss.forEach(i->System.out.println(i));
		
		Set ss1=new LinkedHashSet();
		ss1.add(1);
		ss1.add(0);
		ss1.add(null);
		ss1.forEach(i->System.out.println(i));
		System.out.println("=======Hash Map==========");
		Map<String,String> m=new HashMap<>();
		m.put(null, "x");
		String put = m.put(null, "y");
		m.keySet().forEach(i->System.out.println(i+":"+m.get(i)+":"+put));
		System.out.println("=======Tree Map==========");
		SortedMap<String,String> sm=new TreeMap<>();
//		sm.put(null, "jj");gives null pointer exception
		sm.put("yy", null);//can have null values
		System.out.println("=======Hash Table==========");
		Hashtable<String,String> hT=new Hashtable<>();
//		hT.put(null, "cd");gives null pointer exception
//		hT.put("dsds", null);gives null pointer exception
		hT.put("yyy", "cd");
		System.out.println("=======Tree Set=======");
		TreeSet t = new TreeSet();
//		t.add(null);t.add(new String("abc"));//null pointer exception
		t.add(new StringBuffer("A"));
		//java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
		
		
		
	}

}
