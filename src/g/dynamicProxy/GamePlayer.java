package g.dynamicProxy;

public class GamePlayer implements IGamePlayer{
	private String name;
	public GamePlayer(String name) {
		this.name = name;
	}
	@Override
	public void login(String user, String password) {
		System.out.println(this.name + "登陆了！");
	}
	@Override
	public void killBoss() {
		System.out.println(this.name + " 再打怪！");
	}
	@Override
	public void upgrade() {
		System.out.println(this.name + " 又升了一级！");
	}

}
