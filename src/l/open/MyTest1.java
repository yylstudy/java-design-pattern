package l.open;

/**
 * 装饰模式：动态的给体格对象添加一些额外的职责，就增加功能来说，装饰模式比使用子类继承增加功能更加灵活
 * 
 * 装饰模式的优点:
 * 1)装饰类和被装饰类可以独立发展，而不会相互耦合，
 * 2）装饰模式可以动态的拓展一个类的功能
 * 
 * 装饰模式的缺点：可能造成类膨胀，参考io类设计
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Component concreteComponent = new ConcreteComponent();
		Component decorator = new Decorator(concreteComponent);
		Component decorator2 = new Decorator2(decorator);
		decorator2.operator();
	}
}
