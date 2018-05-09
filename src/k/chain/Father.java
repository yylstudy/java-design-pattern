package k.chain;

public class Father extends Handler{
	public Father(Handler handler) {
		super(handler);
	}
	@Override
	public void HandlerMessage(IWomen women) {
		if(women.getType()==1) {
			System.out.println("女儿的请示是："+women.getRequest());
			System.out.println("父亲的答复是:同意");
		}else {
			System.out.println("父亲不能做主！");
			super.handler.HandlerMessage(women);
		}
	}

}
