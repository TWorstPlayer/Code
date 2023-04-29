import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	public  Employee(){

	}
	public Employee(String name,double salary,int year,int month,int day) {
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}

	public boolean equals(Object otherObject) {


		if(this==otherObject)return true;
		if(otherObject==null)return false;
		if(getClass()!=otherObject.getClass())return false;


		/*if(otherObject instanceof  Employee) {
			Employee e = (Employee) otherObject;
			return name.equals(e.name) && salary == e.salary
					&& hireDay.equals(e.hireDay);
		}else {
			return false;
		}*/

		Employee e = (Employee) otherObject;
			return name.equals(e.name)
					&& salary == e.salary
					&& hireDay.equals(e.hireDay);

	}
	public String toString(){
		return getClass()+"[name="+name
				+"salary="+salary+"hireDay"+hireDay+"]";
	}

	/*public int hashCode(){
		return 7*name.hashCode()+11*new Double(salary).hashCode()+13*hireDay.hashCode();
	}*/

}







