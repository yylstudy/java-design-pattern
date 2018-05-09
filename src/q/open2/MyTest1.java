package q.open2;

/**
 * 这是透明的组合模式，没有把叶子节点和树枝节点分开
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
