package e.open;

public class Director {
	private Builder builder  = new ConcreteProduct();
	//������ͬ�Ĳ�Ʒ
	public Product getProduct() {
		builder.setPart();
		/*
		* ���ò�ͬ�������������ͬ�Ĳ�Ʒ
		*/
		return builder.buildProduct();
	}
}
