package q.composite;

import java.util.ArrayList;

public class Branch extends Corp {
	// �쵼�±�����Щ�¼��쵼��С��
	ArrayList<Corp> subordinateList;

	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}

	public void addSubordinate(Corp corp) {
		corp.setParent(this);//���ø��ڵ�
		subordinateList.add(corp);
	}

	public ArrayList<Corp> getSubordinate() {
		return subordinateList;
	}

}
