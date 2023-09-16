package Other;

public class ConvertHalf {
	
	public static void main(String[] args) {
		
		String str="This is java program This is java program";
		
		String[] sp = str.split(" ");
		
		for (int i = 0; i < sp.length/2; i++) {
			System.out.println(sp[i].toLowerCase());	
			
		}
		for (int i = sp.length/2; i < sp.length; i++) {
			System.out.println(sp[i].toUpperCase());
		}
		
	}
	

}
