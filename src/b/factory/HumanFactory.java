package b.factory;

public class HumanFactory extends AbstractHumanFactory{
	@Override
	public <T extends Human> T createHuman(Class<T> clazz) {
		Human human = null;
		try {
			human = (Human) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) human;
	}

}
