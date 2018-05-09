package r.open;

/**
 * 观察者模式：定义对象之间一种一对多的依赖关系，
 * 使得每当一个对象改变状态，则所有依赖它的对象都会得到通知并被自动更新
 * 观察者模式优点：
 * 1）观察者和被观察者之间是抽象耦合
 * 2）建议一套触发机制
 * 观察者模式的缺点：
 * 观察者模式需要考虑下开发效率和运行效率的问题，而且是单线程顺序执行的，一个观察者挂了，所有的都挂了
 * 所以通常采用异步的方式
 * 
 * 观察者模式需要注意的问题：
 * 1）触发器过长的问题，所以最好消息最多被传递两次
 * 
 * 观察者模式和责任链模式的最大区别就是观察者广播链在传播的过程中消息是随时更改
	的，它是由相邻的两个节点协商的消息结构；而责任链模式在消息传递过程中基本上保持消
	息不可变，如果要改变，也只是在原有的消息上进行修正
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		// 创建一个被观察者
		ConcreteSubject subject = new ConcreteSubject();
		// 定义一个观察者
		Observer obs = new ConcreteObserver();
		// 观察者观察被观察者
		subject.addObserver(obs);
		// 观察者开始活动了
		subject.doSomething();
	}
}
