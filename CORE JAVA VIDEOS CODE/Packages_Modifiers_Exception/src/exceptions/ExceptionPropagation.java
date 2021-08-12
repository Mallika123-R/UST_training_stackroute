package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
// NoSuchElementException, ElementNotVisibleException, ElementNotInteractableException

public class ExceptionPropagation {
	public static void main(String[] args) throws InterruptedException  {
		
			add(2,1);
			try {
				FileInputStream fs = new FileInputStream("D:/xyz.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	public static void add(int a, int b) throws InterruptedException {
		validate(a,b);
		System.out.println("Addition  done");
	}
	
	public static void validate(int a, int b) throws InterruptedException {
			check(a,b);
			System.out.println("validation done");
		
	
	}
	
	public static void check(int a, int b) throws InterruptedException {
		System.out.println("Checking being done");
			
				Thread.sleep(5000);
		
			int i=a/b;
		
	}
}
