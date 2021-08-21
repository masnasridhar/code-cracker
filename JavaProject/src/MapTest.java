import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public MapTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Map<String,String> m=new HashMap();
		System.out.println(m.put("a", "x"));//returns null
		System.out.println(m.put("a", "x"));//returns x
		System.out.println(m.put("a", "y"));//returns x
	}

}
