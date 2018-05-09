package i.open;

public class ConcreteMediator extends Mediator{
	@Override
	public void dosomething1() {
		super.concreteColleague1.selfMethod1();
		super.concreteColleague2.selfMethod();
	}
	@Override
	public void dosomething2() {
		super.concreteColleague1.selfMethod1();
		super.concreteColleague2.selfMethod();
	}
	
}
