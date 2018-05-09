package f.open;
/**
 * 透明代理模式：为其它对象提供一种代理以控制对这个对象的访问
 * 
 * 代理模式的优点：
 * 1）职责清晰
 * 2）高拓展性
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		Subject proxy = new ProxySubject(realSubject);
		proxy.request();
	}
}
