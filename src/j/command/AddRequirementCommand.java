package j.command;

public class AddRequirementCommand extends Command{
	public AddRequirementCommand(Group group) {
		super(group);
	}
	@Override
	public void execute() {
		super.group.find();
		super.group.add();
		super.group.plan();
	}
}
