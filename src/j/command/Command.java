package j.command;

public abstract class Command {
	protected Group group;
	public Command(Group group) {
		this.group = group;
	}
	public abstract void execute();
}
