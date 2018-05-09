package c.abstractFactory;

public class HumanFactory extends AbstractHumanFactory{
	@Override
	<T extends YellowHuman> T createYellowHuman(Class<T> clazz) {
		YellowHuman human = null;
		try {
			human = (YellowHuman) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) human;
	}
	@Override
	<T extends BlackHuman> T createBlackHuman(Class<T> clazz) {
		BlackHuman human = null;
		try {
			human = (BlackHuman) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) human;
	}
	@Override
	<T extends WhiteHuman> T createWhiteHuman(Class<T> clazz) {
		WhiteHuman human = null;
		try {
			human = (WhiteHuman) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) human;
	}
}
