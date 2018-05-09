package k.open;

public abstract class Handler {
	private Handler nextHandler;
	public final Response handlerMessage(Request request) {//ע��ģ��ģʽ��ģ�巽���������Ϊfinal
		Response response = null;
		//�ж��Ƿ����Լ��Ĵ�����
		if(this.getHandlerLevel().equals(request.getRequestLevel())) {
			response = this.execute(request);
		}else {
			//�����Լ��Ĵ�����
			if(nextHandler!=null)
				response = nextHandler.handlerMessage(request);
		}
		return response;
	}
	//��������������һ������
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	//ÿ�������и������𣨹��ĸ������ߴ���
	protected abstract Level getHandlerLevel();
	//ÿ�������߱���ʵ�ִ�������
	protected abstract Response execute(Request request);
}
