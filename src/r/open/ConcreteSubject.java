package r.open;

public class ConcreteSubject extends Subject {
	// �����ҵ��
	public void doSomething() {
		/*
		 * do something
		 */
		super.notifyObservers();
	}
}
