package z.decoratorAndProxy.decorator;

public class RunnerWithJet implements IRunner {
	private IRunner runner;
	public RunnerWithJet(IRunner _runner) {
		this.runner = _runner;
	}
	public void run() {
		System.out.println("�ӿ��˶�Ա���ٶȣ�Ϊ�˶�Ա��������װ��");
		runner.run();
	}
}
