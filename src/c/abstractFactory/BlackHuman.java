package c.abstractFactory;

public abstract class BlackHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("我是黑肤色");
	}

	@Override
	public void talk() {
		System.out.println("我是说黑种人话的");
	}
	
	public abstract void getSex();
}
