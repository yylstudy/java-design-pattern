package y.bridge;

public class ShanZhaiCorp extends Corp {
	// ��ʲô��Ʒ����֪�����ȱ����õĲ�֪��
	public ShanZhaiCorp(Product product) {
		super(product);
	}
	// ��׬Ǯ
	public void makeMoney() {
		super.makeMoney();
		System.out.println("��׬Ǯѽ...");
	}
}
