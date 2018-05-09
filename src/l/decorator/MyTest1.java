package l.decorator;

public class MyTest1 {
	public static void main(String[] args) {
		SchoolReport fouthGradeSchoolReport = new FouthGradeSchoolReport();
		SchoolReport highScoreDecorator = new HighScoreDecorator(fouthGradeSchoolReport);
		SchoolReport sortDecorator = new SortDecorator(highScoreDecorator);
		sortDecorator.report();
		sortDecorator.sign("уехЩ");
	}
}
