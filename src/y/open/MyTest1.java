package y.open;

/**
 * �Ž�ģʽ��������ģʽ���������ʵ�ֽ��ʹ�����߿��Զ����仯
 * 
 * �Ž�ģʽ�ŵ㣺
 * 1�������ʵ�ַ���
 * 2���������������
 * 3��ʵ��ϸ�ڶԿͻ�͸��
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Implementor implementor = new ConcreteImplementor1();
		Abstraction abstraction = new RefinedAbstraction(implementor);
		abstraction.request();
	}
}
