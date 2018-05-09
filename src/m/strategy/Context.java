package m.strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	public void operate() {
		strategy.operate();
	}
}
