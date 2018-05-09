package f.proxy2;

public class GamePlayerProxy implements IGamePlayer{
	private IGamePlayer player;
	public GamePlayerProxy(IGamePlayer player) {
		this.player = player;
	}
	@Override
	public void login(String user, String password) {
		player.login(user, password);
	}
	@Override
	public void killBoss() {
		player.killBoss();
	}
	@Override
	public void upgrade() {
		player.upgrade();
	}
	@Override
	public IGamePlayer getProxy() {
		System.out.println("没有代理了");
		return null;
	}

}
