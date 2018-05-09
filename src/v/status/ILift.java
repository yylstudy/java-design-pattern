package v.status;

public class ILift {
	private LiftState liftState;
	public LiftState openingState = new OpeningState(this);//开门
	public LiftState closeState = new CloseState(this);//闭门
	public LiftState runState = new RunState(this);//运行
	public LiftState stopState = new StopState(this);//停止
	public void setState(LiftState liftState) {
		this.liftState = liftState;
	}
	//首先电梯门开启动作
	public  void open() {
		liftState.open();
	};
	//电梯门可以开启，那当然也就有关闭了
	public  void close() {
		liftState.close();
	};
	//电梯要能上能下
	public  void run() {
		liftState.run();
	};
	//电梯还要能停下来
	public  void stop() {
		liftState.stop();
	};
	public LiftState getOpeningState() {
		return openingState;
	}
	public void setOpeningState(LiftState openingState) {
		this.openingState = openingState;
	}
	public LiftState getCloseState() {
		return closeState;
	}
	public void setCloseState(LiftState closeState) {
		this.closeState = closeState;
	}
	public LiftState getRunState() {
		return runState;
	}
	public void setRunState(LiftState runState) {
		this.runState = runState;
	}
	public LiftState getStopState() {
		return stopState;
	}
	public void setStopState(LiftState stopState) {
		this.stopState = stopState;
	}
	
}
