package exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Start");
		int a=10;
		final int b=2;
		
		//connecting to a db
		try {
			System.out.println("A");
			int c = a/b;
			// connection is success
			// exception
			System.out.println(c);
			System.out.println("B");
		}catch(Exception e) {
			// handle or report the exception / failure
			System.out.println("Some exception " + e.getMessage());
			e.printStackTrace();
		}finally { // always executed
			System.out.println("Learning exceptions");
			// check if connected to db- then disconnect
		}
		System.out.println("End");
	}
	
	public  void abc() {
		
	}

}
