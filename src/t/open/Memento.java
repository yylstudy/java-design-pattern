package t.open;

public class Memento {
	// �����˵��ڲ�״̬
	private String state = "";

	// ���캯�����ݲ���
	public Memento(String _state) {
		this.state = _state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
