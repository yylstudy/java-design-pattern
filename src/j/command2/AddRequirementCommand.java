package j.command2;

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
	@Override
	public void rollback() {
		super.group.delete();
	}
}
