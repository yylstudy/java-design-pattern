package z.builderAndFactory.builder;

public class AdultSuperManBuilder extends Builder{
	@Override
	public SuperMan createSuperMan() {
		super.setBody("ǿ׳������");
		super.setSpecialtalent("�����");
		super.setSpecialSymbol("��ǰ��S���");
		return super.superman;
	}
	
}
