package z.builderAndFactory.builder;

public class AdultSuperManBuilder extends Builder{
	@Override
	public SuperMan createSuperMan() {
		super.setBody("强壮的躯体");
		super.setSpecialtalent("会飞行");
		super.setSpecialSymbol("胸前带S标记");
		return super.superman;
	}
	
}
