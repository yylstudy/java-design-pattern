package t.memento;

public class Boy {
	// �к���״̬
	private String state = "";
	//��ʶŮ���Ӻ�״̬�϶��ı䣬�������顢���еĻ���
	public void changeState() {
		this.state = "������ܺܲ���";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public Memento createMemento() {
		return new Memento(this.state);
	}
	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}
}
