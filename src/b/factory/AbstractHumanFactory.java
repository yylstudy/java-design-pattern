package b.factory;

public abstract class AbstractHumanFactory {
	abstract <T extends Human> T createHuman(Class<T> clazz);
}
