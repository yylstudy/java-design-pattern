package b.openFactory;

/**
 * 工厂模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类
 * 
 * 工厂模式优点：
 * 1）良好的封装性，代码结构清晰
 * 2）屏蔽产品类，也就是调用者不关心产品是如何创建出来的
 * 3）工厂模式是很好的解耦模式，高层模块不依赖底层模块
 * 
 * 工厂模式的缺点：
 * 1）不利于拓展：增加一个产品类需要修改工厂类（这里不需要修改是因为这里使用了反射机制），若是初始化产品方法比较复杂时
 * 可以使用多个工厂方法，再由调用者去指定工厂方法
 * 
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		AbstractHumanFactory humanFactory = new ProductFactory();
		Product human1 = humanFactory.createProduct(ConcreteProduct1.class);
		human1.method1();
		human1.method2();
		Product human2 = humanFactory.createProduct(ConcreteProduct2.class);
		human2.method1();
		human2.method2();
	}
}
