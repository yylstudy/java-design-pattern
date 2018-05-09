package m.open2;
/**
 * 策略枚举：策略枚举是一个非常优秀和方便的设计模式，代码非常简单，但是它受枚举的限制
 * 每个枚举项都是 public、static、final的，拓展性收到一定的约束，因此在系统开发中，策略枚举一般担任
 * 不经常发生变化的角色
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		int a = 3;
		int b = 1;
		System.out.println(Calculator.add.execute(a, b));
		System.out.println(Calculator.dec.execute(a, b));
	}
}
