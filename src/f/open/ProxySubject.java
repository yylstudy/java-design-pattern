package f.open;

public class ProxySubject implements Subject{
	private Subject subject;
	public ProxySubject(Subject subject) {
		super();
		this.subject = subject;
	}

	@Override
	public void request() {
		this.before();//Ԥ����
		subject.request();//ҵ����
		this.after();//���ô���
	}
	public void before() {
		System.out.println("before ");
	}
	public void after() {
		System.out.println("after");
	}

}
