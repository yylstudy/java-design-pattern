package k.chain;

public class Husband extends Handler{
	public Husband(Handler handler) {
		super(handler);
	}
	@Override
	public void HandlerMessage(IWomen women) {
		if(women.getType()==2) {
			System.out.println("妻子的请示是："+women.getRequest());
			System.out.println("丈夫的答复是：同意");
		}else {
			System.out.println("丈夫不能做主");
			super.handler.HandlerMessage(women);
		}
	}

}
