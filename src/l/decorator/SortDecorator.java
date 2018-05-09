package l.decorator;

public class SortDecorator extends Decorator{

	public SortDecorator(SchoolReport report) {
		super(report);
	}
	@Override
	public void report() {
		super.report();
		reportSort();
	}
	public void reportSort() {
		System.out.println("我是排名第38名...");
	}
}
