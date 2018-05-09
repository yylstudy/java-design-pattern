package i.open;

/**
 * 中介者模式（调停者模式）：用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示的相互作用，
 * 从而使其耦合松散，而且可以独立改变他们之间的交互
 * Mediator：抽象中介者角色
 * Concrete Mediator：具体中介者角色，协调各同事角色实现协作行为，因此它必须依赖于各个同事角色
 * Colleague：同事角色，每一个同事角色都知道中介者角色，而且与其它同事通信时，一定要通过中介者角色的协作
 * 每个同事类的行为分为两种：一种是同事本身的行为，叫做自发行为，与其它同事类和中介者没有任何依赖，
 * 第二种是依赖中介者才能完成的行为，叫做依赖方法
 * 
 * 中介者模式的优点：减少类之间的依赖，把原有的一对多的依赖变成一对一的依赖，同事类只依赖中介者，
 * 减少了类之间的耦合
 * 
 * 中介者模式的缺点：中介者类会膨胀，变得很大，逻辑复杂，
 * 
 * 中介者模式：mvc   c减少了m和v的依赖
 * @author yyl-pc
 *
 */
public class MyTest1 {
	
}
