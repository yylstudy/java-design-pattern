package y.bridge;

public abstract class Corp {
	// ����һ������Ĳ�Ʒ���󣬲�֪��������ʲô��Ʒ
	private Product product;
	// ���캯���������ඨ�崫�ݾ���Ĳ�Ʒ����
	public Corp(Product product) {
		this.product = product;
	}
	// ��˾�Ǹ�ʲô�ģ�׬Ǯ�ģ�
	public void makeMoney() {
		// ÿ�ҹ�˾����һ����������
		this.product.beProducted();
		// Ȼ������
		this.product.beSelled();
	}
}
