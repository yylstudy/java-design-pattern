package u.visitor;

public class Manager extends Employee {
	// ���������ְ��ǳ���ȷ��ҵ��
	private String performance;

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	protected void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
