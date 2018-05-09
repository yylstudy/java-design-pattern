package f.proxy2;

/**
 * 强制代理：通过真实角色找到代理
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		IGamePlayer gp = new GamePlayer("张三");
		IGamePlayer proxy = gp.getProxy();
		proxy.login("张三", "123");
		proxy.killBoss();
		proxy.upgrade();
	}
}
