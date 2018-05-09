package e.open;

/**
 * 建造者模式：将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * 在建造者模式中，有四个角色：
 * Product产品类：
 * Builder抽象建造者类：规范产品的组件，一般是由子类实现
 * ConcreteBuilder具体建造者：返回一个组建好的产品
 * Director:导演类：负责安排已有模块的顺序，起到封装的作用，避免高层模块深入到建造者内部的实现类
 * 
 * 建造者模式的优点：
 * 1）良好的封装性：高层不必知道产品内部的实现细节
 * 2）建造者独立，容易拓展
 * 
 * 与工厂模式不同的是：建造者模式关注的是零件类型和装配顺序（Dorector组装产品）
 * 建造者模式最主要的功能是基本方法的
	调用顺序安排，也就是这些基本方法已经实现了，通俗地说就是零件的装配，顺序不同产生
	的对象也不同；而工厂方法则重点是创建，创建零件是它的主要职责，组装顺序则不是它关
	心的。
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Director director = new Director();
		Product product = director.getProduct();
	}
}
