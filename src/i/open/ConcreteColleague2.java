package i.open;

public class ConcreteColleague2 extends Colleague{
	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	//���з���
	public void selfMethod() {
		
	}
	//��������
	public void depMethod2() {
		super.mediator.dosomething2();
	}
}
