package a.policy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 里氏替换原则
 * 1）子类必须完全实现父类的方法
 * 2）子类可以有自己的个性
 * 3）覆盖或实现父类方法时，输入参数应该被放大
 * 4)覆盖或实现父类方法时，输出结果可以被缩小：父类的一个方法的返回值是一个类型T，子类的相同方法（重载或覆
	写）的返回值为S，那么里氏替换原则就要求S必须小于等于T
	
 * 
 * 
 * 例如如下，因为父类
 * @author yyl-pc
 *
 */
public class MyTest2 {
	public static void main(String[] args) {
		Father father = new Father();
		father.doSomething(new HashMap());
		Son son = new Son();
		//输出父类被执行
		//重载应该是匹配最准确的，若Father和Son类的参数互换，则这里输出的是“子类被执行”
		son.doSomething(new HashMap());
	}
	static class Father {
		public Collection doSomething(HashMap map) {
			System.out.println("父类被执行...");
			return map.values();
		}
	}
	static class Son extends Father {
		public Collection doSomething(Map map) {
			System.out.println("子类被执行...");
			return map.values();
		}
	}
}
