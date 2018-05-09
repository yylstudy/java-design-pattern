package u.visitor;

import java.util.ArrayList;
import java.util.List;

public class MyTest1 {
	public static void main(String[] args) {
		for (Employee emp : mockEmployee()) {
			emp.accept(new Visitor());
		}
	}

	// ģ�����˾����Ա��������ǿ����������������ͨ���־ò㴫�ݹ�����
	public static List<Employee> mockEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		// �����������Ա��
		CommonEmployee zhangSan = new CommonEmployee();
		zhangSan.setJob("��дJava���򣬾��Ե����졢�๤�Ӱ��˹�");
		zhangSan.setName("����");
		zhangSan.setSalary(1800);
		zhangSan.setSex(Visitor.MALE);
		empList.add(zhangSan);
		// �����������Ա��
		CommonEmployee liSi = new CommonEmployee();
		liSi.setJob("ҳ����������������̫�������ˣ�");
		liSi.setName("����");
		liSi.setSalary(1900);
		liSi.setSex(Visitor.FEMALE);
		empList.add(liSi);
		// �ٲ���һ������
		Manager wangWu = new Manager();
		wangWu.setName("����");
		wangWu.setPerformance("�������Ǹ�ֵ�������һ�����ƨѽ");
		wangWu.setSalary(18750);
		wangWu.setSex(Visitor.MALE);
		empList.add(wangWu);
		return empList;
	}
}
