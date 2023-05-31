
public class StrategyEasy implements ICreateStrategy{
	private int coolTime=0;

	@Override
	public ITank createTank() {
		// TODO Auto-generated method stub
		TankNPC tank = null;
		if(coolTime >= 100) {
			tank = new TankNPC(300,100);
			coolTime=0;
			System.out.println(1);
		}
		coolTime++;
		return tank;
	}


}
