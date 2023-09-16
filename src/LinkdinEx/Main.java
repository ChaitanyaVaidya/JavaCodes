package LinkdinEx;

import java.time.LocalDate;

public class Main extends MainClass{
	
	public static void main(String[] args) {
		
		 String message = "Hello";
	       for (int i = 0; i<message.length(); i++){
	          System.out.print(message.charAt(i+1));
	       }
		
		System.out.println("apple".compareTo("appl"));
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		System.out.println(message());
	}

}
