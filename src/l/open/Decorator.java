package l.open;

public class Decorator extends Component{
	private Component component;
	
	public Decorator(Component component) {
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
		System.out.println("doSomethingAfter Decorator");
	}
	private void doSomethingBefore() {
		System.out.println("doSomethingBefore Decorator");
	}

}
