package z.decoratorAndProxy.proxy;

public class MyTest1 {
	public static void main(String[] args) {
		// ����һ�������˶�Ա
		IRunner liu = new Runner();
		// ����liu�Ĵ�����
		IRunner agent = new RunnerAgent(liu);
		// Ҫ���˶�Ա�ܲ�
		System.out.println("====�����ҵ��˶�Ա�Ĵ���Ҫ����ȥ�ܲ�===");
		agent.run();
	}
}
