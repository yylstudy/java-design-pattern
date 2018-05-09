package i.open;

public class ConcreteColleague2 extends Colleague{
	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	//自有方法
	public void selfMethod() {
		
	}
	//依赖方法
	public void depMethod2() {
		super.mediator.dosomething2();
	}
}
