package k.chain;

public class Father extends Handler{
	public Father(Handler handler) {
		super(handler);
	}
	@Override
	public void HandlerMessage(IWomen women) {
		if(women.getType()==1) {
			System.out.println("Ů������ʾ�ǣ�"+women.getRequest());
			System.out.println("���׵Ĵ���:ͬ��");
		}else {
			System.out.println("���ײ���������");
			super.handler.HandlerMessage(women);
		}
	}

}
