package u.open;

public abstract class Element {
	//����ҵ���߼�
	public abstract void doSomething();
	//����˭������
	public abstract void accept(IVisitor visitor);
}
