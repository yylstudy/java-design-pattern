package j.command;

/**
 * 
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Group group = new RequirementGroup();
		Command command = new AddRequirementCommand(group);
		command.execute();
	}
}
