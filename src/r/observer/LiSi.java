package r.observer;

public class LiSi implements Observer {
	// ������˹�Ǹ��۲��ߣ�һ���������л������֪��������Ҫ���ϰ�㱨
	public void update(String str) {
		System.out.println("��˹:�۲쵽�����ӻ����ʼ���ϰ�㱨��...");
		this.reportToQinShiHuang(str);
		System.out.println("��˹���㱨���...\n");
	}

	// �㱨����ʼ��
	private void reportToQinShiHuang(String reportContext) {
		System.out.println("��˹�����棬���ϰ壡�������л��--->" + reportContext);
	}
}
