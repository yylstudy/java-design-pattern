package d.open;

public abstract class AbstractClass { 
	private boolean execute = true;
	// ��������  
	protected abstract void doSomething();

	// ��������
	protected abstract void doAnything();

	// ģ�巽��
	public void templateMethod() {
		/*
		 * ���û��������������ص��߼�
		 */
		this.doAnything();
		if(execute) {  //���ӷ���
			this.doSomething();
		}
	}
	public void setExecute(boolean execute) {
		this.execute = execute;
	}
}
