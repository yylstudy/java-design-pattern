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
			if (s instanceof Leaf) { // 是员工就直接获得信息
				info = info + s.getInfo() + "\n";
			} else { // 是个小头目
				info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
			}
		}
		return info;
	}
}
