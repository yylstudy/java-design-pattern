package k.chain;

public class Son extends Handler {
	public Son(Handler handler) {
		super(handler);
	}

	// ĸ���������ʾ
	public void HandlerMessage(IWomen women) {
		if(women.getType()==3) {
			System.out.println("ĸ�׵���ʾ�ǣ�" + women.getRequest());
			System.out.println("���ӵĴ��ǣ�ͬ��");
		}else {
			System.out.println("���Ӳ�������");
			System.out.println("û����");
		}
		
	}
}
