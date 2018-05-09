package k.open;

public abstract class Handler {
	private Handler nextHandler;
	public final Response handlerMessage(Request request) {//注意模板模式的模板方法最好设置为final
		Response response = null;
		//判断是否是自己的处理级别
		if(this.getHandlerLevel().equals(request.getRequestLevel())) {
			response = this.execute(request);
		}else {
			//不是自己的处理级别
			if(nextHandler!=null)
				response = nextHandler.handlerMessage(request);
		}
		return response;
	}
	//设置责任链的下一个环节
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	//每个请求都有个处理级别（供哪个处理者处理）
	protected abstract Level getHandlerLevel();
	//每个处理者必须实现处理任务
	protected abstract Response execute(Request request);
}
