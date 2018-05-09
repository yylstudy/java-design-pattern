package g.dynamicProxy;

public class GamePlayer implements IGamePlayer{
	private String name;
	public GamePlayer(String name) {
		this.name = name;
	}
	@Override
	public void login(String user, String password) {
		System.out.println(this.name + "��½�ˣ�");
	}
	@Override
	public void killBoss() {
		System.out.println(this.name + " �ٴ�֣�");
	}
	@Override
	public void upgrade() {
		System.out.println(this.name + " ������һ����");
	}

}
