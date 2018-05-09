package j.open;

public abstract class Command {
	private Receiver receiver;
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	public void execute() {
		receiver.dosomething1();
	}
}
