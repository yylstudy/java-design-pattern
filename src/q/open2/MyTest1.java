package q.open2;

/**
 * ����͸�������ģʽ��û�а�Ҷ�ӽڵ����֦�ڵ�ֿ�
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public void display(Component root) {
		if(root instanceof Leaf)
			root.doSomething();
		else
			display(root);
	}
}
