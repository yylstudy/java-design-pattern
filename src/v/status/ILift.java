package v.status;

public class ILift {
	private LiftState liftState;
	public LiftState openingState = new OpeningState(this);//����
	public LiftState closeState = new CloseState(this);//����
	public LiftState runState = new RunState(this);//����
	public LiftState stopState = new StopState(this);//ֹͣ
	public void setState(LiftState liftState) {
		this.liftState = liftState;
	}
	//���ȵ����ſ�������
	public  void open() {
		liftState.open();
	};
	//�����ſ��Կ������ǵ�ȻҲ���йر���
	public  void close() {
		liftState.close();
	};
	//����Ҫ��������
	public  void run() {
		liftState.run();
	};
	//���ݻ�Ҫ��ͣ����
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
