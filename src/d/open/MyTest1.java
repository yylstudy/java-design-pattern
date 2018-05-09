package d.open;

/**
 * 定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以
 * 不改变一个算法的结构即可重定义该算法的某些特定步骤
 * 基本方法也叫做基本操作，是由子类实现的方法，并且在模板方法被调用。
 * 可以有一个或几个，一般是一个具体方法，也就是一个框架，实现对基本方法的调度，完成固定的逻辑。
 * 注意　为了防止恶意的操作，一般模板方法都加上final关键字，不允许被覆写，并且模板方法中的基本方法最好
 * 定义成protected的类型，实现类若非必要尽量不要扩大父类中的访问权限
 * 
 * 模板方法优点：
 * 1）封装不变部分，拓展可变部分：把认为不变的算法封装到父类中，而可变的算法则通过继承拓展
 * 2）提取公共代码，便于维护
 * 3）行为由父类控制，子类实现
 * 
 * 模板模式缺点：
 * 1）子类的执行结果会影响父类的行为，也就是子类对父类产生影响，会带来阅读代码的难度
 * 
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		AbstractClass class2 = new ConcreteClass2();
		//调用模板方法
		class1.setExecute(false);//钩子函数使用
		class1.templateMethod();
		class2.templateMethod();
	}
}
