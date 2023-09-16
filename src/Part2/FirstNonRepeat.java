package Part2;

public class FirstNonRepeat {
	public static void main(String[] args) {
		String s1="firstf";
		
		char[] ch = s1.toCharArray();
		
		for(char cn:ch) {
			if(s1.indexOf(cn)==s1.lastIndexOf(cn)) {
				System.out.println(cn);
				break;
			}
		}
	}

}
