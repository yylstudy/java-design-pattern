package p.open;

/**
 * 它提供一种方法访问一个容器中的各个元素，而又不暴露该对象的内部细节
 * 
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		// 声明出容器
		Aggregate agg = new ConcreteAggregate();
		// 产生对象数据放进去
		agg.add("abc");
		agg.add("aaa");
		agg.add("1234");
		// 遍历一下
		Iterator iterator = agg.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
