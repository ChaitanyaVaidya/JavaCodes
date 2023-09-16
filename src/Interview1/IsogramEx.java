package Interview1;

public class IsogramEx {
	public static void main(String[] args) {
		String name="chaic";
		
		name=name.toLowerCase();
		int count=0;
		char[] ca = name.toCharArray();
		
		for (int i = 0; i < ca.length; i++) {
			
			for (int j = i+1; j < ca.length; j++) {
				if(ca[i]==ca[j]) {
					count++;
					System.out.println(ca[i]);
				}
			}
		}if(count!=0) {
			System.out.println("no");
		}else {
			System.out.println("yes");
		}
	}

}
