package Part2;

public class GarbageCollectorEx {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("gc");
		super.finalize();
	}
	
	
	public void simpleMethod() {
		System.out.println("sm");
	}
	
	
	public static void main(String[] args) {
		
		GarbageCollectorEx a1=new GarbageCollectorEx();
		GarbageCollectorEx a2=new GarbageCollectorEx();
		a1=null;
		a2.simpleMethod();
		
		System.gc();
		
	}

}
