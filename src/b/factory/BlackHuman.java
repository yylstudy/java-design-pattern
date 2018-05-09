package b.factory;

public class BlackHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("我是黑肤色");
	}

	@Override
	public void talk() {
		System.out.println("我是说黑种人话的");
	}

}
