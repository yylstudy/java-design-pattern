package t.open;

/**
 * ����¼ģʽ���ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬��
 * �����Ժ�Ϳ��Խ��ö���ָ���ԭ�ȱ����״̬
 * 
 * ����¼ģʽ�����ó�����
 * 1����Ҫ����ͻָ����ݵ����״̬����
 * 2���ṩһ���ɻع��Ĳ���
 * 3����Ҫ��صĸ�������
 * 4�����ݿ����ӵ�����������ʹ�ñ���¼ģʽ
 * 
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		// �����������
		Originator originator = new Originator();
		// ���������¼����Ա
		Caretaker caretaker = new Caretaker();
		// ����һ������¼
		caretaker.setMemento(originator.createMemento());
		// �ָ�һ������¼
		originator.restoreMemento(caretaker.getMemento());
	}
}
