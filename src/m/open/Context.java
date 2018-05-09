package m.open;

public class Context {
	// 抽象策略
	private Strategy strategy;

	// 构造函数设置具体策略
	public Context(Strategy _strategy) {
		this.strategy = _strategy;
	}
	// 封装后的策略方法
	public void doAnythinig() {
		this.strategy.doSomething();
	}
}
