package n.adapter2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {
	/*
	 * Ա���ļ�ͥ��Ϣ
	 */
	public Map getUserHomeInfo() {
		HashMap homeInfo = new HashMap();
		homeInfo.put("homeTelNumbner", "Ա���ļ�ͥ�绰��...");
		homeInfo.put("homeAddress", "Ա���ļ�ͥ��ַ��...");
		return homeInfo;
	}
}
