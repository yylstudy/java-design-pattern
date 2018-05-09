package j.open;

/**
 * 命令模式：是一个高内聚模式，将一个请求封装成一个对象，
 * 从而让你使用不同的请求把客户端参数化，可以提供命令的撤销和恢复功能
 * 命令模式优点：
 * 1）类之间解耦
 * 2）可拓展性
 * 
 * 命令模式缺点：
 * 1）有多个命令就有多个command的子类，造成类膨胀
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Command command = new ConcreteCommand(new ConcreteReceiver());
		command.execute();
	}
}



