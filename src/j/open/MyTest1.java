package j.open;

/**
 * ����ģʽ����һ�����ھ�ģʽ����һ�������װ��һ������
 * �Ӷ�����ʹ�ò�ͬ������ѿͻ��˲������������ṩ����ĳ����ͻָ�����
 * ����ģʽ�ŵ㣺
 * 1����֮�����
 * 2������չ��
 * 
 * ����ģʽȱ�㣺
 * 1���ж��������ж��command�����࣬���������
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Command command = new ConcreteCommand(new ConcreteReceiver());
		command.execute();
	}
}



