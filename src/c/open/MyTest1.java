package c.open;

/**
 * ���󹤳�ģʽ��Ϊ����һ����ػ��໥�����Ķ����ṩһ���ӿڣ���������ָ�����ǵľ�����
 * ���󹤳�ģʽ�ǻ��ڹ���ģʽ�ģ����ж����Ʒ���ʱ��ʹ�ã���N����Ʒ�壬�ڳ��󹤳����о�Ӧ����N������������
 * ��M����Ʒ�ȼ���Ӧ����M��ʵ�ֹ����࣬��ÿ��ʵ�ֹ����У�ʵ�ֲ�ͬ��Ʒ�����������
 * 
 * ���󹤳�ģʽ���ŵ㣺
 * 1�����õķ�װ��
 * 2��������Ʒ��֮�������ϵ�����������ϵ�Ը߲���˵�ǿ������ģ��߲�Ҳ����Ҫ֪��
 * 
 * ���󹤳�ģʽ��ȱ�㣺
 * ��չ��Ʒ������ѣ���Ҫ���Ӳ�Ʒ�壨ע���ǲ�Ʒ�壬���ǲ�Ʒ�ȼ�����չ��Ʒ�ȼ������ף���
 * ��Ҫ�޸ĵĴ�����̫������Υ��������ԭ��
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		AbstractCreator creator1 = new Creator1();
		AbstractCreator creator2 = new Creator2();
		creator1.createProductA().doSomethingA();
		creator2.createProductB().doSomethingB();
	}
}
