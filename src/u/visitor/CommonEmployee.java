package u.visitor;

public class CommonEmployee extends Employee {
	// �������ݣ���ǳ���Ҫ���Ժ��ְҵ�滮���ǿ�����
	private String job;

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	@Override
	protected void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
