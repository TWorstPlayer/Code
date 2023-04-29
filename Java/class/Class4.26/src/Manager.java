public class Manager extends Employee{
    private  double bonus;

    public Manager(String name, double salary, int year, int month, int day, double bonus) {
        super(name, salary, year, month, day);
        bonus =0;
    }

    public  void setBonus(double bonus)
    {
        this.bonus =bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if(!super.equals(otherObject))return false;
        return bonus ==((Manager)otherObject).bonus;
    }
  /*  public int hashCode(){
        return super.hashCode()+new Double(bonus).hashCode();
    }*/
}
