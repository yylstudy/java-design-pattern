package v.status;

/**
 * ״̬ģʽ����һ����������״̬�ı�ʱ��������ı���Ϊ���������������ı�������
 * 
 * ״̬ģʽ���ŵ㣺
 * 1���ṹ��������������ifelse��䣬����˳���Ŀ�ά����
 * 2����װ�����ã��ⲿ�����಻֪��״̬��ľ���ʵ��
 * 
 * ״̬ģʽ��ȱ�㣺
 * 1������кܶ�״̬���ͻ���ɺܶ��״̬�ˣ���������Ͳ��ù���
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		ILift lift = new ILift();
		lift.setState(lift.getOpeningState());
		lift.open();
	}
}
