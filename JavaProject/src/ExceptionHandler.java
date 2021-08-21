
public class ExceptionHandler {


	public static void main(String[] args) {
		try {
			System.out.println("1");
			System.out.println("2");
//			return;//says un-reachable code
			System.out.println("3");
			throw new Exception("fff");
//			System.out.println("unreachable code");
		}
		catch(Exception e) {
			System.out.println("4");
		}
		finally {
			System.out.println("5");
		}
		ExceptionHandler e=new ExceptionHandler();
//		e=null;
		e=new ExceptionHandler();
		System.gc();
		System.out.println("6");
//		System.out.println(10/0);
	}
	protected void finalize(){
	System.out.println("finalize");	
	}
//O/p:	1,2,3,4,5,6
//if an exception raised at statement-2 and while executing the corresponding catch block at statement–4 an exception raised then the statements 1, 5 will execute with abnormal termination
}
