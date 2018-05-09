package o.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements HelloService{
	private String name; 
	public HelloServiceImpl(String name) throws RemoteException {
		super();
		this.name = name;
	}
	@Override
	public String service(String data) throws RemoteException {
		return data + name;  
	}

}
