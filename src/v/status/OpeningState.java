package v.status;

public class OpeningState extends LiftState{
	private ILift lift;
	public OpeningState(ILift lift) {
		this.lift = lift;
	}
	@Override
	public void open() {
		//do nothing
	}
	@Override
	public void close() {
		this.closeWithoutLogic();
		lift.setState(lift.getOpeningState());
	}
	@Override
	public void run() {
		//do nothing
	}
	@Override
	public void stop() {
		this.stopWithoutLogic();
		lift.setState(lift.getStopState());
	}

}
