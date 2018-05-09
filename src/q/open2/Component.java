package q.open2;

import java.util.ArrayList;

public abstract class Component {
	// ��������嶼���еĹ���
	public void doSomething() {
		// ��дҵ���߼�
	}
	// ����һ��Ҷ�ӹ�������֦����
	public abstract void add(Component component);

	// ɾ��һ��Ҷ�ӹ�������֦����
	public abstract void remove(Component component);

	// ��÷�֧�µ�����Ҷ�ӹ�������֦����
	public abstract ArrayList<Component> getChildren();
}
