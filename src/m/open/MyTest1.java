package m.open;

/**
 * 策略模式：定义一组算法，将每个算法封装起来，并且使他们可以互换
 * 
 * 策略模式的优点：
 * 1）算法可以自由切换
 * 2）避免使用多重条件判断
 * 
 * 策略模式的缺点：
 * 1）策略类数量增多，可能造成类膨胀
 * 2）所有策略都必须对外暴露，调用者必须知道使用何种策略，在实际运用中，
 * 	   我们可以使用工厂模式来完成策略类的声明（与工厂模式结合）
 * 
 * 策略模式的注意事项：
 * 1）一个策略家族的具体策略数量超过4个，则需要考虑使用混合模式，解决策略类膨胀和对外暴露的问题
 * 
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		// 声明一个具体的策略
		Strategy strategy = new ConcreteStrategy1();
		// 声明上下文对象
		Context context = new Context(strategy);
		// 执行封装后的方法
		context.doAnythinig();
	}
}
