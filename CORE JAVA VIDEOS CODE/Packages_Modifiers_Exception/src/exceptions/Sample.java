package exceptions;

public class Sample {
//https://www.benchresources.net/wp-content/uploads/2017/02/exception-hierarchy-in-java.png
	public static void main(String[] args) {
		try{
			add(2,0);
			System.out.println("All Over");
		}catch(Exception e) {
			System.out.println("Something wrong");
		}
		
	}
	
	public static void add(int a, int b) {
		validate(a,b);
		System.out.println("Addition  done");
	}
	
	public static void validate(int a, int b) {
			check(a,b);
			System.out.println("validation done");
		
	
	}
	
	public static void check(int a, int b) {
		System.out.println("Checking being done");
		
			int i=a/b;
		
	}

}
