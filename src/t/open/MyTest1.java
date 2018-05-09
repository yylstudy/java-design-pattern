package t.open;

/**
 * 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，
 * 这样以后就可以将该对象恢复到原先保存的状态
 * 
 * 备忘录模式的运用场景：
 * 1）需要保存和恢复数据的相关状态场景
 * 2）提供一个可回滚的操作
 * 3）需要监控的副本场景
 * 4）数据库连接的事务管理就是使用备忘录模式
 * 
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		// 定义出发起人
		Originator originator = new Originator();
		// 定义出备忘录管理员
		Caretaker caretaker = new Caretaker();
		// 创建一个备忘录
		caretaker.setMemento(originator.createMemento());
		// 恢复一个备忘录
		originator.restoreMemento(caretaker.getMemento());
	}
}
