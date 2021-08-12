
public class ForLoops {

	public static void main(String[] args) {
		/*
		for(int i=1;i<=10;i++) {
			System.out.println("4 * " +i+" = "+ i*4);
		}
		// 20
		// 0-19
		String s =  "Today is a fine day. We are learining";
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		*/
		
		for(int i=1;i<=10;i++) {
			System.out.println("Table of "+i);
			for(int j=1;j<=10;j++) {
				System.out.println(i +" * "+ j +" = "+ i*j);
				if(j==5)
					break;
			}
			System.out.println("----------------");
		}
		
		
		
		
		
		

	}

}
