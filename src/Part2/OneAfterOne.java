package Part2;

public class OneAfterOne {
	public static void main(String[] args) {
		String name="chaitanya";
		
		char[] ch = name.toCharArray();
		
		for (int i = 1; i < ch.length; i=i+2) {
			System.out.print(ch[i]);
		}
	}

}
