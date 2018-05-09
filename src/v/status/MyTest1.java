package v.status;

/**
 * 状态模式：当一个对象内在状态改变时，允许其改变行为，这个对象看起来像改变了其类
 * 
 * 状态模式的优点：
 * 1）结构清晰，避免过多的ifelse语句，提高了程序的可维护性
 * 2）封装性良好，外部调用类不知道状态类的具体实现
 * 
 * 状态模式的缺点：
 * 1）如果有很多状态，就会造成很多的状态了，造成类膨胀不好管理
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		ILift lift = new ILift();
		lift.setState(lift.getOpeningState());
		lift.open();
	}
}
