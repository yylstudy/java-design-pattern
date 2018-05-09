package b.openFactory;

public class ProductFactory extends AbstractHumanFactory{
	@Override
	public <T extends Product> T createProduct(Class<T> clazz) {
		Product human = null;
		try {
			human = (Product) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) human;
	}

}
