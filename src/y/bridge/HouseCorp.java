package y.bridge;

public class HouseCorp extends Corp {
	// ���崫��һ��House��Ʒ����
	public HouseCorp(House house) {
		super(house);
	}

	// ���ز���˾��High�ˣ�׬Ǯ����������
	public void makeMoney() {
		super.makeMoney();
		System.out.println("���ز���˾׬��Ǯ��...");
	}
}
