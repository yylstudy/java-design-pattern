package r.open;

import java.util.Vector;

public abstract class Subject {
	// ����һ���۲�������
	private Vector<Observer> obsVector = new Vector<Observer>();

	// ����һ���۲���
	public void addObserver(Observer o) {
		this.obsVector.add(o);
	}

	// ɾ��һ���۲���
	public void delObserver(Observer o) {
		this.obsVector.remove(o);
	}

	// ֪ͨ���й۲���
	public void notifyObservers() {
		for (Observer o : this.obsVector) {
			o.update();
		}
	}
}
