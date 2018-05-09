package k.chain;

public class Son extends Handler {
	public Son(Handler handler) {
		super(handler);
	}

	// 母亲向儿子请示
	public void HandlerMessage(IWomen women) {
		if(women.getType()==3) {
			System.out.println("母亲的请示是：" + women.getRequest());
			System.out.println("儿子的答复是：同意");
		}else {
			System.out.println("儿子不能做主");
			System.out.println("没人了");
		}
		
	}
}
