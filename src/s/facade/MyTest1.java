package s.facade;

/**
 * 外观模式：要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行，外观模式
 * 提供了一个高层次接口
 * 
 * 外观模式优点：
 * 1）较少系统的相互依赖，所有依赖都是对外观类的依赖，外观类具体依赖具体的子系统
 * 2）提高灵活性：若要修改只需修改外观类
 * 3）提高安全性：尽量少暴露类接口给外部
 * 
 * 外观模式缺点：不符合开闭原则，外观类不能拓展
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.doAll();
	}
}
