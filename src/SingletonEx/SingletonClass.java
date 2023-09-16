package SingletonEx;

public class SingletonClass {
	
	private static SingletonClass instance=new SingletonClass();
	
	private SingletonClass() {
		
	}

	public static SingletonClass getInstance() {
		return instance;
	}

    public void simpleMethod() {
    	System.out.println("Hashcode of singleton class:"+instance);
    }
	

}
