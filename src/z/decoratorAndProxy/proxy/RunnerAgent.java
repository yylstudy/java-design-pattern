package z.decoratorAndProxy.proxy;

import java.util.Random;

public class RunnerAgent implements IRunner{
	private IRunner runner;

	public RunnerAgent(IRunner _runner) {
		this.runner = _runner;
	}

	// �������ǲ����ܵ�
	public void run() {
		Random rand = new Random();
		if (rand.nextBoolean()) {
			System.out.println("������ͬ�ⰲ���˶�Ա�ܲ�");
			runner.run();
		} else {
			System.out.println("���������鲻�ã��������˶�Ա�ܲ�");
		}
	}
}
