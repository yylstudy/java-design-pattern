package j.command2;

public abstract class Command {
	protected Group group;
	public Command(Group group) {
		this.group = group;
	}
	public abstract void execute();
	public abstract void rollback();
}
