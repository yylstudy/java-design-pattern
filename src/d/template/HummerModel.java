package d.template;

public abstract class HummerModel {
	/*
	* ���ȣ����ģ��Ҫ�ܹ��������������������ҡ���������ǵ�������������
	* ��Ҫ�ܹ����������������ʵ��Ҫ��ʵ��������
	*/
	public abstract void start();
	//�ܷ�������Ҫ��ͣ�������ǲ����汾��
	public abstract void stop();
	//���Ȼ���������ǵενУ��������ٽ�
	public abstract void alarm();
	//������¡¡���죬�������Ǽٵ�
	public abstract void engineBoom();
	//��ģ��Ӧ�û��ܰɣ���������Ƶģ����ǵ��������ģ���֮Ҫ����
	public  void run() {
		//�ȷ�������
		this.start();
		//���濪ʼ����
		this.engineBoom();
		//Ȼ��Ϳ�ʼ���ˣ��ܵĹ���������һ������·���Ͱ�����
		this.alarm();
		//����Ŀ�ĵؾ�ͣ��
		this.stop();
	}
}
