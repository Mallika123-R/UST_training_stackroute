
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class ReadingProperties {
	
	public static void main(String arg[]) throws IOException {
		
		
		System.out.println(System.getProperty("user.dir"));
				
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"\\project.properties";
		FileInputStream fs = new FileInputStream(path);
		prop.load(fs);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("url"));

		// xls, json, yaml
		
		Date d = new Date();
		System.out.println(d);
		// https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple/1.1.1
	}

}
