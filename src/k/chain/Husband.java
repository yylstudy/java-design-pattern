package k.chain;

public class Husband extends Handler{
	public Husband(Handler handler) {
		super(handler);
	}
	@Override
	public void HandlerMessage(IWomen women) {
		if(women.getType()==2) {
			System.out.println("���ӵ���ʾ�ǣ�"+women.getRequest());
			System.out.println("�ɷ�Ĵ��ǣ�ͬ��");
		}else {
			System.out.println("�ɷ�������");
			super.handler.HandlerMessage(women);
		}
	}

}
