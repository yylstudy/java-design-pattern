package j.command2;

/**
 * 
 *回滚的命令模式
 */
public class MyTest1 {
	public static void main(String[] args) {
		Group group = new RequirementGroup();
		Command command = new AddRequirementCommand(group);
		command.execute();
		System.out.println("客户想要回滚操作。。。。");
		command.rollback();
	}
}
