package k.chain;

public class Women implements IWomen{
	private int type;
	public Women(int type) {
		this.type = type;
	}
	@Override
	public int getType() {
		return type;
	}

	@Override
	public String getRequest() {
		System.out.println("����ȥ��ֿ�����");
		return "";
	}

}
