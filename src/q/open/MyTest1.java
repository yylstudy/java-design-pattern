package q.open;

/**
 * ���ģʽ����������ϳ����νṹ���Ա�ʾ������-���塱�Ĳ�νṹ��ʹ�û��Ե����������϶����ʹ�þ���һ����
 * 
 * ���ģʽ���ŵ㣺
 * 1���߲�ģ����ü򵥣�һ�������нڵ㶼��Component
 * 2���ڵ��������ɣ�ʹ����Ͽ������������ӽڵ�
 * 
 * 
 * ���ǰ�ȫģʽ����Ϊ��Ҷ�ӽڵ����֦�ڵ�ֿ�
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public void display(Component root) {
		if(root instanceof Leaf)
			root.doSomething();
		else
			display((Composite)root);
	}
}
