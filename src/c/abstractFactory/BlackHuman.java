package c.abstractFactory;

public abstract class BlackHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("���Ǻڷ�ɫ");
	}

	@Override
	public void talk() {
		System.out.println("����˵�����˻���");
	}
	
	public abstract void getSex();
}
