package m.open;

public class Context {
	// �������
	private Strategy strategy;

	// ���캯�����þ������
	public Context(Strategy _strategy) {
		this.strategy = _strategy;
	}
	// ��װ��Ĳ��Է���
	public void doAnythinig() {
		this.strategy.doSomething();
	}
}
