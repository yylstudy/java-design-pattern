package t.open;

public class Originator {
	// �ڲ�״̬
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// ����һ������¼
	public Memento createMemento() {
		return new Memento(this.state);
	}

	// �ָ�һ������¼
	public void restoreMemento(Memento _memento) {
		this.setState(_memento.getState());
	}
}
