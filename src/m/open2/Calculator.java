package m.open2;

public enum Calculator {
	add("+"){
		@Override
		protected int execute(int a,int b) {
			return a+b;
		}
	},
	dec("-"){
		@Override
		protected int execute(int a,int b) {
			return a-b;
		}
	};
	private String s;
	private Calculator(String s) {
		this.s = s;
	}
	protected int execute(int a,int b) {
		return 0;
	}
}
