package x.flyweight;

/**
 * ��Ԫģʽ���ؼ�������Ҫʵ�ַ�ʽ��ʹ�ù���������Ч��֧�ִ���ϸ���ȵĶ���
 * 
 * ��Ԫģʽ���ŵ㣺
 * 1�����ٶ���Ĵ�����ʹ�ù������
 * 2����������̰߳�ȫ����
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		// ��ʼ�������
		for (int i = 0; i < 4; i++) {
			String subject = "��Ŀ" + i;
			// ��ʼ����ַ
			for (int j = 0; j < 30; j++) {
				String key = subject + "���Եص�" + j;
				SignInfoFactory.getSignInfo(key);
			}
		}
		SignInfo signInfo = SignInfoFactory.getSignInfo("��Ŀ1���Եص�1");
	}
}
