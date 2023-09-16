package Other;

public class Main {
	public static void main(String[] args) {
		try {
			throw new Calculation();
			
		}catch(Calculation c){
			c.add(10, 20);;
		}
	}

}
