package Part2;

public class ArmstrongEx {
	public static void main(String[] args) {
		int a1=153;
		int r,sum=0;
		int temp=a1;
		
		while(a1>0) {
			r=a1%10;
			a1=a1/10;
			
			sum=sum+r*r*r;
		}
		if(temp==sum) {
			System.out.println("arm");
		}else {
			System.out.println("no");
		}
		
	}

}
