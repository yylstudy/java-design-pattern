package n.open;

/**
 * 适配器模式：将一个类的接口变成客户端所期待的另一个接口，
 * 从而使原本因接口不匹配而无法一起工作的两个类一起工作
 * 使用继承被适配的类 是类适配器模式
 * 使用组合被适配的类 是对象适配器
 * 
 * 
 * 
 * 适配器模式优点：
 * 1）可以让两个没有关联的类一起运行
 * 2）增加类的透明性，具体的类对高层模块是透明的，也是它不关心的
 * 3）提高类的复用度
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}
}
