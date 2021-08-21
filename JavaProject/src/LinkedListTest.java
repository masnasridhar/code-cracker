import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList l = new LinkedList<String>();

		l.add("A");
		l.add("B");
		l.add("C");
		

		System.out.println(l.pop());
		System.out.println(l.pop());
		System.out.println(l.pop());
		//peek for stack gets getFirst
		//push means addFirst and pop means removeFirst===>A-->B-->C
		
		List<String> ls1=new ArrayList<String>();
		ls1.add("1");
		ls1.add("2");
		ls1.add("3");
		
		Iterator<String> iterator = ls1.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().contains("1"))
				iterator.remove();
//				ls1.remove("1");gives concurrent modification error
		}
		
//		List list= new ArrayList();
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add("vivek");
		list.add("kumar");
		Iterator i =list.iterator();//CopyOnWriteArrayList keeps a copy of original List and iterate over this. The new value which has been added is merged to copy of orignal array only after Iteration is over.
		while(i.hasNext()){
		System.out.println(i.next());//will throw a ConcurrentModificationException at when we call next() next time.So use CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add("abhishek");
		System.out.println(list.size()+":"+list.hashCode());
//		i.remove();we cannot use iterator methods (i.remove()) to modify the elements of CopyOnWriteArrayList
		}
		System.out.println(list.hashCode());
		
	}

}
