package b.openFactory;

/**
 * ����ģʽ������һ�����ڴ�������Ľӿڣ����������ʵ������һ���ࡣ��������ʹһ�����ʵ�����ӳٵ�������
 * 
 * ����ģʽ�ŵ㣺
 * 1�����õķ�װ�ԣ�����ṹ����
 * 2�����β�Ʒ�࣬Ҳ���ǵ����߲����Ĳ�Ʒ����δ���������
 * 3������ģʽ�ǺܺõĽ���ģʽ���߲�ģ�鲻�����ײ�ģ��
 * 
 * ����ģʽ��ȱ�㣺
 * 1����������չ������һ����Ʒ����Ҫ�޸Ĺ����ࣨ���ﲻ��Ҫ�޸�����Ϊ����ʹ���˷�����ƣ������ǳ�ʼ����Ʒ�����Ƚϸ���ʱ
 * ����ʹ�ö���������������ɵ�����ȥָ����������
 * 
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		AbstractHumanFactory humanFactory = new ProductFactory();
		Product human1 = humanFactory.createProduct(ConcreteProduct1.class);
		human1.method1();
		human1.method2();
		Product human2 = humanFactory.createProduct(ConcreteProduct2.class);
		human2.method1();
		human2.method2();
	}
}
