import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class GFG {
	public static void main(String[] args) {

		List<Point> aList = new ArrayList<>();
		aList.add(new Point(10, 20));
		aList.add(new Point(5, 10));
		aList.add(new Point(1, 100));
		aList.add(new Point(50, 2000));

		// displaying the stream with elements sorted according to x coordinate
		aList.stream().sorted((p1, p2) -> p1.x.compareTo(p2.x)).forEach(System.out::println);
		System.out.println("========");
		aList.stream().sorted(Comparator.comparing(Point::getx)).forEach(System.out::println);
		System.out.println("========");
		aList.stream().sorted(new CB()).forEach(System.out::println);
	}
}

class Point {
	Integer x, y;

	Point(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
 public Integer getx() {
	 return x;
 }
	public String toString() {
		return this.x + ", " + this.y;
	}
}
class CB implements Comparator<Point>{
	@Override
	public int compare(Point o1, Point o2) {
		return Integer.compare(o1.getx(), o2.getx());
	}
}
