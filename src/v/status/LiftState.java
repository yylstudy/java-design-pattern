package v.status;

public abstract class LiftState {
	// 首先电梯门开启动作
	public abstract void open();

	// 电梯门可以开启，那当然也就有关闭了
	public abstract void close();

	// 电梯要能上能下
	public abstract void run();

	// 电梯还要能停下来
	public abstract void stop();

	// 纯粹的电梯关门，不考虑实际的逻辑
	protected void closeWithoutLogic() {
		System.out.println("电梯门关闭...");
	}

	// 纯粹的电梯开门，不考虑任何条件
	protected void openWithoutLogic() {
		System.out.println("电梯门开启...");
	}

	// 纯粹的运行，不考虑其他条件
	protected void runWithoutLogic() {
		System.out.println("电梯上下运行起来...");
	}

	// 单纯的停止，不考虑其他条件
	protected void stopWithoutLogic() {
		System.out.println("电梯停止了...");
	}
}
