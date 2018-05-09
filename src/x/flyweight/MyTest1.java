package x.flyweight;

/**
 * 享元模式：池技术的重要实现方式，使用共享对象可有效的支持大量细粒度的对象
 * 
 * 享元模式的优点：
 * 1）减少对象的创建，使用共享对象、
 * 2）可能造成线程安全问题
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		// 初始化对象池
		for (int i = 0; i < 4; i++) {
			String subject = "科目" + i;
			// 初始化地址
			for (int j = 0; j < 30; j++) {
				String key = subject + "考试地点" + j;
				SignInfoFactory.getSignInfo(key);
			}
		}
		SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
	}
}
