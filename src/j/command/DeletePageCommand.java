package j.command;

public class DeletePageCommand extends Command{
	public DeletePageCommand(Group group) {
		super(group);
	}
	@Override
	public void execute() {
		super.group.find();
		super.group.delete();
		super.group.plan();
	}
	
}
