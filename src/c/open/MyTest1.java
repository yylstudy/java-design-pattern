package c.open;

/**
 * 抽象工厂模式：为创建一组相关或相互依赖的对象提供一个接口，而且无须指定它们的具体类
 * 抽象工厂模式是基于工厂模式的，在有多个产品族的时候使用，有N个产品族，在抽象工厂类中就应该有N个创建方法。
 * 有M个产品等级就应该有M个实现工厂类，在每个实现工厂中，实现不同产品族的生产任务。
 * 
 * 抽象工厂模式的优点：
 * 1：良好的封装性
 * 2：各个产品族之间存在联系，但是这个联系对高层来说是看不见的，高层也不需要知道
 * 
 * 抽象工厂模式的缺点：
 * 拓展产品族很困难，若要增加产品族（注意是产品族，不是产品等级，拓展产品等级很容易），
 * 需要修改的代码量太大，严重违反“开闭原则”
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		AbstractCreator creator1 = new Creator1();
		AbstractCreator creator2 = new Creator2();
		creator1.createProductA().doSomethingA();
		creator2.createProductB().doSomethingB();
	}
}
