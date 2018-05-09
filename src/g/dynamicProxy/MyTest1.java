package g.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * ʹ��jdk��̬����
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		IGamePlayer igp = new GamePlayer("����");
		GamePlayIH handler = new GamePlayIH(igp);
		IGamePlayer proxy = (IGamePlayer) Proxy.
				newProxyInstance(igp.getClass().getClassLoader(), igp.getClass().getInterfaces(), handler);
		proxy.login("����", "123");
		proxy.killBoss();
	}
}
