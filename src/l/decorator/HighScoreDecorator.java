package l.decorator;

public class HighScoreDecorator extends Decorator{
	
	public HighScoreDecorator(SchoolReport report) {
		super(report);
	}
	@Override
	public void report() {
		reportHighScore();
		super.report();
	}
	public void reportHighScore() {
		System.out.println("这次考试语文最高是75，数学是78，自然是80");
	}
	
}
