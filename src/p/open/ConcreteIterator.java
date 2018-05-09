package p.open;

import java.util.Vector;

public class ConcreteIterator implements Iterator{
	private Vector vector;
	private int cursor;
	public ConcreteIterator(Vector vector) {
		this.vector  = vector;
	}
	@Override
	public Object next() {
		Object result = null;
		if(hasNext())
			result = vector.get(cursor++);
		return result;
	}

	@Override
	public boolean hasNext() {
		if(cursor==vector.size())
			return false;
		return true;
	}

	@Override
	public boolean remove() {
		vector.remove(this.cursor);
		return true;
	}

}
