package p.open;

/**
 * ���ṩһ�ַ�������һ�������еĸ���Ԫ�أ����ֲ���¶�ö�����ڲ�ϸ��
 * 
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		// ����������
		Aggregate agg = new ConcreteAggregate();
		// �����������ݷŽ�ȥ
		agg.add("abc");
		agg.add("aaa");
		agg.add("1234");
		// ����һ��
		Iterator iterator = agg.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
