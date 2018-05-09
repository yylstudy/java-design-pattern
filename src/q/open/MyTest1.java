package q.open;

/**
 * 组合模式：将对象组合成树形结构，以表示“部分-整体”的层次结构，使用户对单个对象和组合对象的使用具有一致性
 * 
 * 组合模式的优点：
 * 1）高层模块调用简单，一棵树所有节点都是Component
 * 2）节点增加自由：使用组合可以随意增加子节点
 * 
 * 
 * 这是安全模式，因为把叶子节点和树枝节点分开
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
