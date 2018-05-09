package q.composite;

import java.util.ArrayList;

/**
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static String getTreeInfo(Branch root) {
		ArrayList<Corp> subordinateList = root.getSubordinate();
		String info = "";
		for (Corp s : subordinateList) {
			if (s instanceof Leaf) { // ��Ա����ֱ�ӻ����Ϣ
				info = info + s.getInfo() + "\n";
			} else { // �Ǹ�СͷĿ
				info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
			}
		}
		return info;
	}
}
