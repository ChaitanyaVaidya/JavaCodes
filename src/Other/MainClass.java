package Other;

public class MainClass {
	public static void main(String[] args) {
		ParentClass pc=new ParentClass();
		pc.displayName();
		ParentClass.displayName();
		Child.reDisplayName();
	}

}
