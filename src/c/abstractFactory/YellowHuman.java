package c.abstractFactory;

public abstract class YellowHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("���ǻƷ�ɫ");
	}

	@Override
	public void talk() {
		System.out.println("����˵�����˻���");
	}
	public abstract void getSex();
}
