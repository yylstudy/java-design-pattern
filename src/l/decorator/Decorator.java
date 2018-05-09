package l.decorator;

public class Decorator extends SchoolReport{
	private SchoolReport report;
	public Decorator(SchoolReport report) {
		this.report = report;
	}
	@Override
	public void report() {
		report.report();
	}
	@Override
	public void sign(String name) {
		report.sign(name);
	}
	
}
