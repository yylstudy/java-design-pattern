package f.proxy2;

/**
 * ǿ�ƴ���ͨ����ʵ��ɫ�ҵ�����
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		IGamePlayer gp = new GamePlayer("����");
		IGamePlayer proxy = gp.getProxy();
		proxy.login("����", "123");
		proxy.killBoss();
		proxy.upgrade();
	}
}
