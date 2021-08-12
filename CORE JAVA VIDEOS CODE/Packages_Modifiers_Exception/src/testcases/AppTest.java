package testcases;

import java.util.Date;

import application.util.AppUtil;
import application.util.Application;
import application.util.C;

/*
 *  public - accessed anywhere within package, outside
 *  default - accessed within package
 *  private - only inside class
 *  protected - accessed within package + child classes in current or any other package
 */

public class AppTest {

	public static void main(String[] args) {
		AppUtil app = new AppUtil();
		System.out.println(app.filePath);
		app.print("Hello testing");
		
		TestUtil test = new TestUtil();
		test.name="AppTest";
		test.printName();
		test.increaseCount();
		
		C c = new C();
		
		Date d = new Date();
		System.out.println(d.toString());
		
		System.out.println(Application.name);

	}

}
