package SingletonEx;

public class MainClass {
	public static void main(String[] args) {
		SingletonClass sc= SingletonClass.getInstance();
		sc.simpleMethod();
		
		SingletonClass cs= SingletonClass.getInstance();
		cs.simpleMethod();
	}

}
