package j.command2;

/**
 * 
 *�ع�������ģʽ
 */
public class MyTest1 {
	public static void main(String[] args) {
		Group group = new RequirementGroup();
		Command command = new AddRequirementCommand(group);
		command.execute();
		System.out.println("�ͻ���Ҫ�ع�������������");
		command.rollback();
	}
}
