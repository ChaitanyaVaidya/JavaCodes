package Part2;

public class DigitsEx {
	public static void main(String[] args) {
		
		String s1="Chaitanyaa";
		
		String rp = s1.replaceAll("[0-9]", "");
		System.out.println(rp);
		
		if(s1.equals(rp)) {
			System.out.println("not Contain");
		}else {
			System.out.println("contain");
		}
		
		
		
		
		
//		char[] ch = s1.toCharArray();
//		
//		for (int i = 0; i < ch.length; i++) {
//			if(ch[i]!=i) {
//				System.out.println("not");
//			}else {
//				System.out.println("Yes");
//			}
			
		}
	}


