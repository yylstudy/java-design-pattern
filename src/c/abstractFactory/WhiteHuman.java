package c.abstractFactory;

public abstract class WhiteHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("���ǰ׷�ɫ");
	}

	@Override
	public void talk() {
		System.out.println("����˵�����˻���");
	}
	public abstract void getSex();
}
