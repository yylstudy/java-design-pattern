package h.prototype;

/**
 * ԭ��ģʽ����ԭ��ʵ��ָ��������������࣬����ͨ��������Щԭ�ʹ����µĶ���
 * ԭ��ģʽ��Ҫʹ�õ��� clone����
 * ע�����¡��ǳ��¡
 * 
 * ԭ��ģʽ���ŵ㣺
 * 1���������������ڴ���ж����ƿ�������ֱ��newһ���������ܺúܶ�
 * 2���ӱܹ��캯����Լ��������clone������������ʱ��������ö���Ĺ�����������������������ŵ�Ҳ������ȱ�㣩
 * 
 * ԭ��ģʽע�����
 * 1�����캯�����ᱻִ��
 * 2��Ҫʹ��clone��������ĳ�Ա�����ϲ�Ҫ����final�ؼ��֡�
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) throws Exception {
		int i=0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX���а�Ȩ����");
		while(i<5) {
			//��������̲߳���ȫ�����⣬���Ƕ��߳�����£��ڻ�δ���Ͷ���ʱ����һ���߳��޸���mail�������
			//����mail���̰߳�ȫ�ˣ���������ж��֣�
			//1����֮ǰ��mail����ŵ�ѭ������
			//2��ʹ��clone��Ҳ����ʹ��ԭ��ģʽ
			mail.setAppellation(i+"����");
			mail.setReceiver(i+"����");
			Mail cloneMali = (Mail) mail.clone();
			sendMail(cloneMali);
			i++;
		}
	}
	public static void sendMail(Mail mail) {
		System.out.println("���⣺"+mail.getSubject()+"\t�ռ��ˣ�"+mail.getReceiver()+"���ͳɹ�");
	}
}
