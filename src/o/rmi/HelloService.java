package o.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface  HelloService extends Remote {
	public String service(String data) throws RemoteException;  
	
}
