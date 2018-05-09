package r.observer;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZi implements IHanFeiZi {
	private List<Observer> list = new ArrayList<Observer>();
	// 韩非子要吃饭了
	public void haveBreakfast() {
		System.out.println("韩非子:开始吃饭了...");
		notifyObserver("韩非子在吃饭了");
	}
	// 韩非子开始娱乐了
	public void haveFun() {
		System.out.println("韩非子:开始娱乐了...");
		notifyObserver("韩非子在娱乐了");
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
