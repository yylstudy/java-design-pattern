package b.factory;

public class WhiteHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("我是白肤色");
	}

	@Override
	public void talk() {
		System.out.println("我是说白种人话的");
	}

}
