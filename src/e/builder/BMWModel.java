package e.builder;

public class BMWModel extends CarModel {
	protected void alarm() {
		System.out.println("����������������������ӵ�...");
	}

	protected void engineBoom() {
		System.out.println("���������������������...");
	}

	protected void start() {
		System.out.println("������������������ӵ�...");
	}

	protected void stop() {
		System.out.println("����Ӧ������ͣ��...");
	}
}