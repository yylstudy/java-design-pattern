package k.chain;

public abstract class Handler {
	protected Handler handler;
	public Handler(Handler handler) {
		this.handler = handler;
	}
	public abstract void HandlerMessage(IWomen women);
}
