package y.open;

public abstract class Abstraction {
	private Implementor implementor;
	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}
	public void request() {
		implementor.doSomething();
	}
	public Implementor getImp() {
		return implementor;
	}
}
