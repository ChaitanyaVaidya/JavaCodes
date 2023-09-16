package Interview1;

public class SpecialChar {
	public static void main(String[] args) {
		String s1="c@Vv#9";
		
		String ra = s1.replaceAll( "[a-zA-Z0-9]","");
		System.out.println(ra);
	}

}
