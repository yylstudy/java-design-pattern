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
		System.out.println("��ο������������75����ѧ��78����Ȼ��80");
	}
	
}
