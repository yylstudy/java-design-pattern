package p.open;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate {
	// ���ɶ��������
	private Vector vector = new Vector();

	// ����һ��Ԫ��
	public void add(Object object) {
		this.vector.add(object);
	}

	// ���ص���������
	public Iterator iterator() {
		return new ConcreteIterator(this.vector);
	}

	// ɾ��һ��Ԫ��
	public void remove(Object object) {
		this.remove(object);
	}
}
