package v.status;

public abstract class LiftState {
	// ���ȵ����ſ�������
	public abstract void open();

	// �����ſ��Կ������ǵ�ȻҲ���йر���
	public abstract void close();

	// ����Ҫ��������
	public abstract void run();

	// ���ݻ�Ҫ��ͣ����
	public abstract void stop();

	// ����ĵ��ݹ��ţ�������ʵ�ʵ��߼�
	protected void closeWithoutLogic() {
		System.out.println("�����Źر�...");
	}

	// ����ĵ��ݿ��ţ��������κ�����
	protected void openWithoutLogic() {
		System.out.println("�����ſ���...");
	}

	// ��������У���������������
	protected void runWithoutLogic() {
		System.out.println("����������������...");
	}

	// ������ֹͣ����������������
	protected void stopWithoutLogic() {
		System.out.println("����ֹͣ��...");
	}
}
