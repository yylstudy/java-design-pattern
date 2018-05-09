package e.builder;

import java.util.ArrayList;

public abstract class CarModel {
	// ��������Ǹ�����������ִ�е�˳��
	private ArrayList<String> sequence = new ArrayList<String>();
	// ģ����������ʼ����
	protected abstract void start();
	// �ܷ�������Ҫ��ͣ�������ǲ����汾��
	protected abstract void stop();
	// ���Ȼ���������ǵενУ��������ٽ�
	protected abstract void alarm();
	// ������¡¡���죬�������Ǽٵ�
	protected abstract void engineBoom();
	// ��ģ��Ӧ�û��ܰɣ���������Ƶģ����ǵ�����������֮Ҫ����
	final public void run() {
		// ѭ��һ�ߣ�˭��ǰ������ִ��˭
		for (int i = 0; i < this.sequence.size(); i++) {
			String actionName = this.sequence.get(i);
			if (actionName.equalsIgnoreCase("start")) {
				this.start(); // ��������
			} else if (actionName.equalsIgnoreCase("stop")) {
				this.stop(); // ֹͣ����
			} else if (actionName.equalsIgnoreCase("alarm")) {
				this.alarm(); // ���ȿ�ʼ����
			} else if (actionName.equalsIgnoreCase("engine boom")) {
				// �����engine boom�ؼ���
				this.engineBoom(); // ���濪ʼ����
			}
		}
	}

	// �Ѵ��ݹ�����ֵ���ݵ�����
	final public void setSequence(ArrayList sequence) {
		this.sequence = sequence;
	}
}
