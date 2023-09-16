package Other;

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.Console;
import java.io.InputStreamReader;

public class ConsoleEx {
	public static void main(String[] args) {
		//Console c=System.console();
		System.out.println("enter your name:");
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String s1=bf.readLine();
			System.out.println(s1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("welcome:"+s1);
	}

}
