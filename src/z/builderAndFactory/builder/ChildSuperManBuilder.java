package z.builderAndFactory.builder;

public class ChildSuperManBuilder extends Builder {
	@Override
	public SuperMan createSuperMan() {
		super.setBody("ǿ׳������");
		super.setSpecialtalent("��ǹ����");
		super.setSpecialSymbol("��ǰ��СS���");
		return super.superman;
	}
}
