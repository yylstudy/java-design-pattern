package b.factory;

public class WhiteHuman implements Human{
	@Override
	public void getColor() {
		System.out.println("���ǰ׷�ɫ");
	}

	@Override
	public void talk() {
		System.out.println("����˵�����˻���");
	}

}
