package PartOne;

public class GarbageCollectorEx {
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("object is gc");
	}
	
	public void simpleMethod() {
		System.out.println("sm");
	}
	
	public static void main(String[] args) {
		GarbageCollectorEx ex=new GarbageCollectorEx();
		GarbageCollectorEx sl=new GarbageCollectorEx();
		
		ex=null;
		sl.simpleMethod();
		
		System.gc();
	}

}
