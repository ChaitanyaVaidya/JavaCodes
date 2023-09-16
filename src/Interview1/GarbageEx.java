package Interview1;

public class GarbageEx {
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("object gc");
	}
	
	public void name() {
		System.out.println("name");
	}
	public static void main(String[] args) {
		
		GarbageEx gb=new GarbageEx();
		gb=null;
		
		GarbageEx jd=new GarbageEx();
		jd.name();
		
		System.gc();
	}

}
