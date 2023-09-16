package Other;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Ex {
	
	public static void main(String[] args) {
		
	
	List<Employee> ls=new ArrayList<>();
	//Employee ep=new Employee(28,"ABC",50000,"HR","Male",2014);
	ls.add(new Employee(28,"ABC",50000,"HR","Male",2014));
	ls.add(new Employee(26,"PQR",51000,"Tech","Female",2015));
	ls.add(new Employee(33,"LMN",60000,"HR","Male",2017));
	ls.add(new Employee(29,"XYZ",89000,"Ops","Female",2014));
	
	
	String name = ls.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get().getName() ;
	System.out.println(name);

	List<Employee> cl = ls.stream().filter(s->s.year>2014).collect(Collectors.toList());
   System.out.println(cl);
}
}