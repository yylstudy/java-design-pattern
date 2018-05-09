package f.open;

public class ProxySubject implements Subject{
	private Subject subject;
	public ProxySubject(Subject subject) {
		super();
		this.subject = subject;
	}

	@Override
	public void request() {
		this.before();//预处理
		subject.request();//业务处理
		this.after();//后置处理
	}
	public void before() {
		System.out.println("before ");
	}
	public void after() {
		System.out.println("after");
	}

}
