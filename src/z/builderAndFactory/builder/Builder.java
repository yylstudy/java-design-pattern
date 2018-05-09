package z.builderAndFactory.builder;

public abstract class Builder {
	protected SuperMan superman = new SuperMan();
	public void setBody(String body) {
		superman.setBody(body);
	}
	public void setSpecialtalent(String specialtalent) {
		superman.setSpecialTalent(specialtalent);
	}
	public void setSpecialSymbol(String specialSymbol) {
		superman.setSpecialSymbol(specialSymbol);
	}
	public abstract SuperMan createSuperMan();
}
