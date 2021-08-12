package exceptions;

import java.io.IOException;

import testcases.A;

public class TypesOfExceptions {

	public static void main(String[] args) {
		
		A a = null;
		int i=0;
		try {
			a.x=10;
			i=10;
		}catch(NullPointerException e) {
			System.out.println("Some exception");
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("Some exception");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Some exception");
			e.printStackTrace();
		}
		
		System.out.println(i);
	
	}

}
