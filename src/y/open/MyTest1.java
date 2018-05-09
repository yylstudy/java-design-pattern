package y.open;

/**
 * 桥接模式或者桥梁模式：将抽象和实现解耦，使得两者可以独立变化
 * 
 * 桥接模式优点：
 * 1）抽象和实现分离
 * 2）优秀的扩充能力
 * 3）实现细节对客户透明
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Implementor implementor = new ConcreteImplementor1();
		Abstraction abstraction = new RefinedAbstraction(implementor);
		abstraction.request();
	}
}
