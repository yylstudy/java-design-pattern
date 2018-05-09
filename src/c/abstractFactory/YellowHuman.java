package c.abstractFactory;

public abstract class YellowHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("我是黄肤色");
	}

	@Override
	public void talk() {
		System.out.println("我是说黄种人话的");
	}
	public abstract void getSex();
}
