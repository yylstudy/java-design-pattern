package q.open;

import java.util.ArrayList;

public class Composite extends Component {
	// ��������
	private ArrayList<Component> componentArrayList = new ArrayList<Component>();

	// ����һ��Ҷ�ӹ�������֦����
	public void add(Component component) {
		this.componentArrayList.add(component);
	}

	// ɾ��һ��Ҷ�ӹ�������֦����
	public void remove(Component component) {
		this.componentArrayList.remove(component);
	}

	// ��÷�֧�µ�����Ҷ�ӹ�������֦����
	public ArrayList<Component> getChildren() {
		return this.componentArrayList;
	}
}
