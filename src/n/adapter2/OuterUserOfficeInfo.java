package n.adapter2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
	/*
	 * Ա���Ĺ�����Ϣ�����磬ְλ��
	 */
	public Map getUserOfficeInfo() {
		HashMap officeInfo = new HashMap();
		officeInfo.put("jobPosition", "����˵�ְλ��BOSS...");
		officeInfo.put("officeTelNumber", "Ա���İ칫�绰��...");
		return officeInfo;
	}
}
