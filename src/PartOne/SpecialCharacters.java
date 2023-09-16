package PartOne;

public class SpecialCharacters {
	public static void main(String[] args) {
		String s1="c@Vv#9";
		
		String aa = s1.replaceAll("[a-zA-Z0-9]", "");
		String ra = s1.replaceAll("[a-zA-Z0-9]", "");
		
		System.out.println(aa);
		System.out.println(ra);
	}

}
