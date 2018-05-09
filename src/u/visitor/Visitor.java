package u.visitor;

public class Visitor implements IVisitor {
	public final static int MALE = 0; // 0����������
	public final static int FEMALE = 1; // 1������Ů��
	
	// ������ͨԱ������ӡ������
	@Override
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployee(commonEmployee));
	}

	// ���ʲ��ž�����ӡ������
	@Override
	public void visit(Manager manager) {
		System.out.println(this.getManagerInfo(manager));
	}

	// ��װ��������Ϣ
	private String getBasicInfo(Employee employee) {
		String info = "������" + employee.getName() + "\t";
		info = info + "�Ա�" + (employee.getSex() == FEMALE ? "Ů" : "��") + "\t";
		info = info + "нˮ��" + employee.getSalary() + "\t";
		return info;
	}

	// ��װ�����ž������Ϣ
	private String getManagerInfo(Manager manager) {
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "ҵ����" + manager.getPerformance() + "\t";
		return basicInfo + otherInfo;
	}

	// ��װ����ͨԱ����Ϣ
	private String getCommonEmployee(CommonEmployee commonEmployee) {
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "������" + commonEmployee.getJob() + "\t";
		return basicInfo + otherInfo;
	}
}
