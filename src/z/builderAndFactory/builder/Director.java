package z.builderAndFactory.builder;

public class Director {
	private Builder builder1 = new AdultSuperManBuilder();
	private Builder builder2 = new ChildSuperManBuilder();

	public SuperMan getAdultSuperMan() {
		return builder1.createSuperMan();
	}

	public SuperMan getChildSuperMan() {
		return builder2.createSuperMan();
	}
}
