package i.open;

public class ConcreteColleague1 extends Colleague{
	//ͨ�����캯�������н���
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	//���з���
	public void selfMethod1() {
		
	}
	//��������
	public void depMethod1() {
		super.mediator.dosomething1();
	}
	
}
