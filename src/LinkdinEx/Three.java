package LinkdinEx;

public class Three implements One,Two {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		One.super.method();
	}
	
	public static void main(String[] args) {
		Three th=new Three();
		th.method();
	}

}
