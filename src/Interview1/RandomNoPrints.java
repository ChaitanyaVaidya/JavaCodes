package Interview1;

import java.util.Random;
import java.util.Scanner;

public class RandomNoPrints {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		Random random=new Random();
		
		random.ints(10,99).limit(n).forEach(System.out::println);
	}

}
