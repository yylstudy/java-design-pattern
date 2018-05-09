package a.singleton;

/**
 * ����ģʽͨ�ô���
 * ����ģʽ�ŵ㣺
 * 1�����ڵ���ģʽ���ڴ���ֻ��һ��ʵ�����������ڴ濪֧
 * 2���ڵ���ģʽֻ����һ��ʵ�������Լ�����ϵͳ�����ܿ���
 * 3������ģʽ������ϵͳ����ȫ�ֵķ��ʵ㣬�Ż��͹�����Դ����
 * 
 * ����ģʽȱ�㣺
 * 1�� ����ģʽһ��û�нӿڣ���չ������
 * 
 * ����ģʽ��ʹ�ó�����
 * 1��Ҫ������Ψһ���кŵĻ�����
 * 2����������Ŀ����Ҫһ��������ʵ��������
 * 3������һ��������Ҫ���ĵ���Դ���࣬��Ҫ����IO�����ݿ����Դ��
 * 4�� ��Ҫ��������ľ�̬�����;�̬�������繤���ࣩ�Ļ��������Բ��õ���ģʽ����Ȼ��Ҳ����ֱ������Ϊstatic�ķ�ʽ��
 * @author yyl-pc
 *
 */
public class OpenSingleton {
	private OpenSingleton openSingleton;
	private OpenSingleton() {
		
	}
	public OpenSingleton getInstance() {
		if(openSingleton==null) {
			synchronized(OpenSingleton.class) {
				if(openSingleton==null)
					openSingleton = new OpenSingleton();
			}
		}
		return openSingleton;
	}
}
