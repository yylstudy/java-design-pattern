package u.open;

public class Visitor implements IVisitor {
	// ����el1Ԫ��
	public void visit(ConcreteElement1 el1) {
		el1.doSomething();
	}

	// ����el2Ԫ��
	public void visit(ConcreteElement2 el2) {
		el2.doSomething();
	}
}
