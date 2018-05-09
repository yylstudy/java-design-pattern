package g.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler{
	private Object object;
	public GamePlayIH(Object object) {
		super();
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("前置操作");
		Object obj = method.invoke(object, args);
		System.out.println("后置操作");
		return obj;
	}
	
}
