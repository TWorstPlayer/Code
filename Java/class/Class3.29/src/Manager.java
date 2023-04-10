public class Manager extends Employee {
    private int bonus;

    public Manager(String aName,int aSalary,int aBonus) {
        super(aName,aSalary);
        bonus=aBonus;
    }

    public Manager(String aName) {
        super(aName);

    }


    public double getSalary(int bonus,int bonus2) {
        return getSalary()+bonus+bonus2;//和父类之间的关系是重载
    }

    public Manager getPartner1(){
        return new Manager("李四");
    }
}