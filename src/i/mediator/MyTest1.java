package i.mediator;

/**
 * δʹ���н���ģʽ�������̫��
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		// �ɹ���Ա�ɹ�����
		System.out.println("------�ɹ���Ա�ɹ�����--------");
		Purchase purchase = new Purchase();
		purchase.buyIBMcomputer(100);
		// ������Ա���۵���
		System.out.println("\n------������Ա���۵���--------");
		Sale sale = new Sale();
		sale.sellIBMComputer(1);
		// �ⷿ������Ա������
		System.out.println("\n------�ⷿ������Ա��⴦��--------");
		Stock stock = new Stock();
		stock.clearStock();
	}
}
