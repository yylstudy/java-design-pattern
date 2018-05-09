package e.open;

public class ConcreteProduct extends Builder{
	Product p = new Product();
	@Override
	public Product buildProduct() {
		return p;
	}

	@Override
	public void setPart() {
		p.setI(10);
	}
	
}
