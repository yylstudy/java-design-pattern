package d.open;

public abstract class AbstractClass { 
	private boolean execute = true;
	// 基本方法  
	protected abstract void doSomething();

	// 基本方法
	protected abstract void doAnything();

	// 模板方法
	public void templateMethod() {
		/*
		 * 调用基本方法，完成相关的逻辑
		 */
		this.doAnything();
		if(execute) {  //钩子方法
			this.doSomething();
		}
	}
	public void setExecute(boolean execute) {
		this.execute = execute;
	}
}
