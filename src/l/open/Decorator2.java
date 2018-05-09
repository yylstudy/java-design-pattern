package l.open;

public class Decorator2 extends Component{
	private Component component;
	public Decorator2(Component component) {
		super();
		this.component = component;
	}
	@Override
	public void operator() {
		doSomethingBefore();
		component.operator();
		doSomethingAfter();
	}
	private void doSomethingAfter() {
		System.out.println("doSomethingAfter Decorator2");
	}
	private void doSomethingBefore() {
		System.out.println("doSomethingBefore Decorator2");
	}

}
