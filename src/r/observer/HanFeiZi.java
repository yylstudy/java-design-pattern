package r.observer;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZi implements IHanFeiZi {
	private List<Observer> list = new ArrayList<Observer>();
	// ������Ҫ�Է���
	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		notifyObserver("�������ڳԷ���");
	}
	// �����ӿ�ʼ������
	public void haveFun() {
		System.out.println("������:��ʼ������...");
		notifyObserver("��������������");
	}
	@Override
	public void addObserver(Observer observer) {
		list.add(observer);
	}
	@Override
	public void deleteObserver(Observer observer) {
		list.remove(observer);
	}
	@Override
	public void notifyObserver(String context) {
		for(Observer o:list) {
			o.update(context);
		}
	}
}
