package f.open;
/**
 * ͸������ģʽ��Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ���
 * 
 * ����ģʽ���ŵ㣺
 * 1��ְ������
 * 2������չ��
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		Subject proxy = new ProxySubject(realSubject);
		proxy.request();
	}
}
