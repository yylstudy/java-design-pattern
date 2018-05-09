package i.open;

public abstract class Mediator {
	protected ConcreteColleague1 concreteColleague1;
	protected ConcreteColleague2 concreteColleague2;
	public Mediator() {
		concreteColleague1 = new ConcreteColleague1(this);
		concreteColleague2 = new ConcreteColleague2(this);
	}
	public abstract void dosomething1();
	public abstract void dosomething2();
}
