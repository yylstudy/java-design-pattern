package r.observer;

public class WangSi implements Observer {

	@Override
	public void update(String str) {
		System.out.println("��˹���۲쵽�����ӻ���Լ�Ҳ��ʼ���...");
		this.cry(str);
		System.out.println("��˹��������...\n");
	}

	// һ���������л������ʹ��
	private void cry(String context) {
		System.out.println("��˹����Ϊ" + context + "��--�����ұ���ѽ��");
	}
}
