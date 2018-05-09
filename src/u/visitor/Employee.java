package u.visitor;

public abstract class Employee {
	// �¹���˭�����й���
	private String name;
	// ֻҪ��Ա���Ǿ���нˮ
	private int salary;
	// �Ա����Ҫ
	private int sex;

	// �����Ǽ򵥵�getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	protected abstract void accept(IVisitor visitor);
}
