package u.open;

/**
 * 访问者模式：封装一些作用于某种数据结构中各元素的操作，它可以在不改变数据结构的前提下定义
 * 作用于这些元素的新操作
 * 访问者模式的优点：
 * 1）符合单一职责原则
 * 2）优秀的拓展性
 * 3）灵活性非常高
 * 
 * 访问者模式缺点：
 * 1）具体元素对访问者公布细节
 * 2）违背依赖倒置原则
 * 
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			// 获得元素对象
			Element el = ObjectStruture.createElement();
			// 接受访问者访问
			el.accept(new Visitor());
		}
	}
}
