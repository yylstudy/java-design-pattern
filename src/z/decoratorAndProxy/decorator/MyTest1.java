package z.decoratorAndProxy.decorator;

public class MyTest1 {
	public static void main(String[] args) {
		Runner run = new Runner();
		RunnerWithJet rwj = new RunnerWithJet(run);
		System.out.println("===��ǿ����˶�Ա�Ĺ���===");
		rwj.run();
	}
}
