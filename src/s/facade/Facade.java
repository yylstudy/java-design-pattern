package s.facade;

public class Facade {
	// 被委托的对象
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();
	private ClassC c = new ClassC();
	public void doAll() {
		methodA();
		methodB();
		methodC();
	}
	// 提供给外部访问的方法
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
