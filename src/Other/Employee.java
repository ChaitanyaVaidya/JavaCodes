package Other;

public class Employee {
//	
//	public Employee() {
//		
//	}
	
	
	public int id;
	
	public String name;
	
	public int salary;
	
	public String dept;

	public String catg;
	
	public int year;
	
	
	
	public Employee(int id, String name, int salary, String dept, String catg, int year) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.catg = catg;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCatg() {
		return catg;
	}

	public void setCatg(String catg) {
		this.catg = catg;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", catg=" + catg
				+ ", year=" + year + "]";
	}

}
