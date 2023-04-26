public class Employee {
    private final String name;
    private double salary;

    public Employee(String aName) {
        name=aName;
		//salary=aSalary;
    }//一般情况下，一旦创建，变量的值就不再改变的对象建议写在参数中


    public Employee(String aName,double aSalary) {
        this(aName);
        salary=aSalary;
    }

    public double getSalary() {
        return salary;
    }

    public double getSalary(int bonus) {
        return salary+bonus;
    }

    public Employee getPartner(){
        return new Employee("张三");
    }



}