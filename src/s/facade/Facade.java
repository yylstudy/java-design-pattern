package s.facade;

public class Facade {
	// ��ί�еĶ���
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();
	private ClassC c = new ClassC();
	public void doAll() {
		methodA();
		methodB();
		methodC();
	}
	// �ṩ���ⲿ���ʵķ���
	private void methodA() {
		this.a.doSomethingA();
	}

	private void methodB() {
		this.b.doSomethingB();
	}

	private void methodC() {
		this.c.doSomethingC();
	}
}
