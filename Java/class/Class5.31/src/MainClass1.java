public class MainClass1 {
	public static void main(String[] args) {
		
		GameFrame frame = new GameFrame();
		//frame.setStrategy(new StrategyEasy());//简单难度
		frame.setStrategy(new StrategyHard());//困难难度 
		frame.start();
	}	
}
