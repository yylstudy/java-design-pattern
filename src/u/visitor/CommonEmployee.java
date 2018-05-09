package u.visitor;

public class CommonEmployee extends Employee {
	// 工作内容，这非常重要，以后的职业规划就是靠它了
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
