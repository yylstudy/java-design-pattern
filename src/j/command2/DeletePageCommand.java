package j.command2;

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
	@Override
	public void rollback() {
		super.group.add();
		
	}
	
}
