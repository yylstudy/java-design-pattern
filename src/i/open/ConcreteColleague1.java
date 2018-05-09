package i.open;

public class ConcreteColleague1 extends Colleague{
	//通过构造函数传递中介者
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	//自有方法
	public void selfMethod1() {
		
	}
	//依赖方法
	public void depMethod1() {
		super.mediator.dosomething1();
	}
	
}
