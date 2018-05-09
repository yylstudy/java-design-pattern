package y.open;

public class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}
	@Override
	public void request() {
		super.request();
		super.getImp().doAnything();
	}
}
