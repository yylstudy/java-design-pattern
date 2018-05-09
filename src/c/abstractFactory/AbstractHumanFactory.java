package c.abstractFactory;

public abstract class AbstractHumanFactory {
	abstract <T extends YellowHuman> T createYellowHuman(Class<T> clazz);
	abstract <T extends BlackHuman> T createBlackHuman(Class<T> clazz);
	abstract <T extends WhiteHuman> T createWhiteHuman(Class<T> clazz);
}
