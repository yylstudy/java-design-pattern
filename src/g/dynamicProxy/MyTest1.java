package g.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 使用jdk动态代理
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		IGamePlayer igp = new GamePlayer("张三");
		GamePlayIH handler = new GamePlayIH(igp);
		IGamePlayer proxy = (IGamePlayer) Proxy.
				newProxyInstance(igp.getClass().getClassLoader(), igp.getClass().getInterfaces(), handler);
		proxy.login("张三", "123");
		proxy.killBoss();
	}
}
