package b.openFactory;

public abstract class AbstractHumanFactory {
	abstract <T extends Product> T createProduct(Class<T> clazz);
}
