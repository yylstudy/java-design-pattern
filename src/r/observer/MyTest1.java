package r.observer;

public class MyTest1 {
	public static void main(String[] args) {
		IHanFeiZi hanFeiZi = new HanFeiZi();
		hanFeiZi.addObserver(new LiSi());
		hanFeiZi.addObserver(new WangSi());
		hanFeiZi.haveBreakfast();
		hanFeiZi.haveFun();
	}
}
