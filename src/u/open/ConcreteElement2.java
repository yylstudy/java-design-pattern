package u.open;

public class ConcreteElement2 extends Element {
	// ����ҵ���߼�
	public void doSomething() {
		// ҵ����
	}
	
	// �����Ǹ������߷���
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}