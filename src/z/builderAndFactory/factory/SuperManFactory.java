package z.builderAndFactory.factory;

public class SuperManFactory {
	public static SuperMan getSuperMan(String type) {
		SuperMan superMan = null;
		if(type.equals("AdultentSuperman"))
			superMan = new AdultentSuperman();
		else 
			superMan = new ChildSuperMan();
		return superMan;
	}
}
