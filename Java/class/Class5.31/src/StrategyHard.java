public class StrategyHard implements ICreateStrategy{
    private int coolTime=0;
    private int count=0;
    @Override
    public ITank createTank() {
        // TODO Auto-generated method stub
        TankNPC tank = null;
        if(coolTime >= 10) {
            tank = new TankNPC(300,100);
            coolTime=0;
            count++;
            System.out.println(count);
        }
        coolTime++;
        return tank;
    }
}
