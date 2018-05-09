package u.visitor;

public abstract class Employee {
	// 甭管是谁，都有工资
	private String name;
	// 只要是员工那就有薪水
	private int salary;
	// 性别很重要
	private int sex;

	// 以下是简单的getter/setter
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
