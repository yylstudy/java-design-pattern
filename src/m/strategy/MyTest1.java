package m.strategy;

public class MyTest1 {
	// ���Ƴ����ˣ�����������������Ľ��������β����
	public static void main(String[] args) {
		Context context;
		// �ոյ������ʱ����һ��
		System.out.println("---�ոյ������ʱ����һ��---");
		context = new Context(new BackDoor()); // �õ����
		context.operate(); // ��ִ��
		System.out.println("\n\n\n\n\n\n\n\n");
		// �����ֲ�˼���ˣ���ڶ�����
		System.out.println("---�����ֲ�˼���ˣ���ڶ�����---");
		context = new Context(new GivenGreenLight());
		context.operate(); // ִ���˵ڶ�������
		System.out.println("\n\n\n\n\n\n\n\n");
		// ��Ȩ��С��׷���ˣ�զ�죿�������
		System.out.println("---��Ȩ��С��׷���ˣ�զ�죿�������---");
		context = new Context(new BlockEnemy());
		context.operate(); // ������˱�
		System.out.println("\n\n\n\n\n\n\n\n");
	}
}
