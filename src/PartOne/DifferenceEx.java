package PartOne;

public class DifferenceEx {
	
	public int differenceEx(int m,int n) {
		
        int a1 = 0,a2=0;
		
		for (int i = 0; i <= n; i++) {
			if(i%m==0) {
				a1=a1+i;
			}else {
				a2=a2+i;
			}}
		return a2-a1;
		
		}
	
	
	public static void main(String[] args) {
		DifferenceEx df=new DifferenceEx();
		System.out.println(df.differenceEx(6, 30));
		
		
	}

}
