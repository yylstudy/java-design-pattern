package l.decorator;

public class FouthGradeSchoolReport extends SchoolReport {
	// �ҵĳɼ���
	public void report() {
		// �ɼ����ĸ�ʽ��������ӵ�
		System.out.println("�𾴵�XXX�ҳ�:");
		System.out.println(" ......");
		System.out.println(" ���� 62 ��ѧ65 ���� 98 ��Ȼ 63");
		System.out.println(" .......");
		System.out.println(" �ҳ�ǩ���� ");
	}

	// �ҳ�ǩ��
	public void sign(String name) {
		System.out.println("�ҳ�ǩ��Ϊ��" + name);
	}
}
