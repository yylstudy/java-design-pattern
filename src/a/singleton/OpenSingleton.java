package a.singleton;

/**
 * 单例模式通用代码
 * 单例模式优点：
 * 1）由于单例模式在内存中只有一个实例，减少了内存开支
 * 2）于单例模式只生成一个实例，所以减少了系统的性能开销
 * 3）单例模式可以在系统设置全局的访问点，优化和共享资源访问
 * 
 * 单例模式缺点：
 * 1） 单例模式一般没有接口，扩展很困难
 * 
 * 单例模式的使用场景：
 * 1）要求生成唯一序列号的环境；
 * 2）在整个项目中需要一个共享访问点或共享数据
 * 3）创建一个对象需要消耗的资源过多，如要访问IO和数据库等资源；
 * 4） 需要定义大量的静态常量和静态方法（如工具类）的环境，可以采用单例模式（当然，也可以直接声明为static的方式）
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
