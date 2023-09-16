package Part2;

public class A {
	
	static void m1(String h) {
		try {
		int a= Integer.parseInt(h);
		a=a+10;
		System.out.println(a);
	}catch(NumberFormatException e){
		System.out.println("invalid integer");
		}
	}
	
	public static void main(String[] args) {
		m1("23");
		m1("kiran");
		
	}

}
