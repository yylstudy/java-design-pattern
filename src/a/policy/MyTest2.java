package a.policy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * �����滻ԭ��
 * 1�����������ȫʵ�ָ���ķ���
 * 2������������Լ��ĸ���
 * 3�����ǻ�ʵ�ָ��෽��ʱ���������Ӧ�ñ��Ŵ�
 * 4)���ǻ�ʵ�ָ��෽��ʱ�����������Ա���С�������һ�������ķ���ֵ��һ������T���������ͬ���������ػ�
	д���ķ���ֵΪS����ô�����滻ԭ���Ҫ��S����С�ڵ���T
	
 * 
 * 
 * �������£���Ϊ����
 * @author yyl-pc
 *
 */
public class MyTest2 {
	public static void main(String[] args) {
		Father father = new Father();
		father.doSomething(new HashMap());
		Son son = new Son();
		//������౻ִ��
		//����Ӧ����ƥ����׼ȷ�ģ���Father��Son��Ĳ���������������������ǡ����౻ִ�С�
		son.doSomething(new HashMap());
	}
	static class Father {
		public Collection doSomething(HashMap map) {
			System.out.println("���౻ִ��...");
			return map.values();
		}
	}
	static class Son extends Father {
		public Collection doSomething(Map map) {
			System.out.println("���౻ִ��...");
			return map.values();
		}
	}
}
