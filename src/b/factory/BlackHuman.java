package b.factory;

public class BlackHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("���Ǻڷ�ɫ");
	}

	@Override
	public void talk() {
		System.out.println("����˵�����˻���");
	}

}
