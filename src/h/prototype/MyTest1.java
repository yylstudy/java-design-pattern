package h.prototype;

/**
 * 原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * 原型模式主要使用的是 clone方法
 * 注意深克隆和浅克隆
 * 
 * 原型模式的优点：
 * 1）性能优良：在内存进行二进制拷贝，比直接new一个对象性能好很多
 * 2）逃避构造函数的约束，调用clone方法创建对象时，不会调用对象的构造器方法（这个既是它的优点也是它的缺点）
 * 
 * 原型模式注意事项：
 * 1）构造函数不会被执行
 * 2）要使用clone方法，类的成员变量上不要增加final关键字。
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) throws Exception {
		int i=0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX银行版权所有");
		while(i<5) {
			//这里存在线程不安全的问题，若是多线程情况下，在还未发送对象时，另一个线程修改了mail这个对象
			//导致mail不线程安全了，解决方法有多种，
			//1）把之前的mail定义放到循环中来
			//2）使用clone，也就是使用原型模式
			mail.setAppellation(i+"先生");
			mail.setReceiver(i+"先生");
			Mail cloneMali = (Mail) mail.clone();
			sendMail(cloneMali);
			i++;
		}
	}
	public static void sendMail(Mail mail) {
		System.out.println("标题："+mail.getSubject()+"\t收件人："+mail.getReceiver()+"发送成功");
	}
}
