package u.open;

/**
 * ������ģʽ����װһЩ������ĳ�����ݽṹ�и�Ԫ�صĲ������������ڲ��ı����ݽṹ��ǰ���¶���
 * ��������ЩԪ�ص��²���
 * ������ģʽ���ŵ㣺
 * 1�����ϵ�һְ��ԭ��
 * 2���������չ��
 * 3������Էǳ���
 * 
 * ������ģʽȱ�㣺
 * 1������Ԫ�ضԷ����߹���ϸ��
 * 2��Υ����������ԭ��
 * 
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			// ���Ԫ�ض���
			Element el = ObjectStruture.createElement();
			// ���ܷ����߷���
			el.accept(new Visitor());
		}
	}
}
