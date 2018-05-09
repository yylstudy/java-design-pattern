package q.composite;

import java.util.ArrayList;

public class Branch extends Corp {
	// 领导下边有哪些下级领导和小兵
	ArrayList<Corp> subordinateList;

	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}

	public void addSubordinate(Corp corp) {
		corp.setParent(this);//设置父节点
		subordinateList.add(corp);
	}

	public ArrayList<Corp> getSubordinate() {
		return subordinateList;
	}

}
