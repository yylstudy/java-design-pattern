package n.adapter2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {
	/*
	 * �û��Ļ�����Ϣ
	 */
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "���Ա���л���ħ��...");
		baseInfoMap.put("mobileNumber", "���Ա���绰��...");
		return baseInfoMap;
	}
}
