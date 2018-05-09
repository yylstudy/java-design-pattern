package z.builderAndFactory.builder;

public class ChildSuperManBuilder extends Builder {
	@Override
	public SuperMan createSuperMan() {
		super.setBody("强壮的躯体");
		super.setSpecialtalent("刀枪不入");
		super.setSpecialSymbol("胸前带小S标记");
		return super.superman;
	}
}
