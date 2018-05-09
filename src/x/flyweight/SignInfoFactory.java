package x.flyweight;

import java.util.HashMap;

public class SignInfoFactory {
	private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();
	@Deprecated
	public static SignInfo SignInfo(){
		return new SignInfo();
	}
	public static SignInfo getSignInfo(String key) {
		SignInfo result = null;
		if(!pool.containsKey(key)){
			result = new SignInfo4Pool(key);
			pool.put(key, result);
		}else {
			result = pool.get(key);
		}
		return result;
	}
}
