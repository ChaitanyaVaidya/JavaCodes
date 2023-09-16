package ComparableEx;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		Employee[] emp=new Employee[3];
		emp[0]=new Employee(1, "cv", 25);
		emp[1]=new Employee(7, "av", 23);
		emp[2]=new Employee(5, "tv", 24);
		
		Arrays.sort(emp);
		System.out.println(Arrays.toString(emp));
		
		Arrays.sort(emp,Employee.ageComparator);
		System.out.println(Arrays.toString(emp));
		
	}

}
