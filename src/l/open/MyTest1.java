package l.open;

/**
 * װ��ģʽ����̬�ĸ����������һЩ�����ְ�𣬾����ӹ�����˵��װ��ģʽ��ʹ������̳����ӹ��ܸ������
 * 
 * װ��ģʽ���ŵ�:
 * 1)װ����ͱ�װ������Զ�����չ���������໥��ϣ�
 * 2��װ��ģʽ���Զ�̬����չһ����Ĺ���
 * 
 * װ��ģʽ��ȱ�㣺������������ͣ��ο�io�����
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Component concreteComponent = new ConcreteComponent();
		Component decorator = new Decorator(concreteComponent);
		Component decorator2 = new Decorator2(decorator);
		decorator2.operator();
	}
}
