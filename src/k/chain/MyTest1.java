package k.chain;

/**
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Handler son = new Son(null);
		Handler husband = new Husband(son);
		Handler father = new Father(husband);
		Women women = new Women(4);
		women.getRequest();
		father.HandlerMessage(women);
	}
}
