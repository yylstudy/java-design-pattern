package c.abstractFactory;

public class MyTest1 {
	public static void main(String[] args) {
		AbstractHumanFactory humanFactory = new HumanFactory();
		YellowHuman yellowHumanMan = humanFactory.createYellowHuman(YellowHumanMan.class);
		YellowHuman yellowHumanWomen = humanFactory.createYellowHuman(YellowHumanWomen.class);
		yellowHumanMan.getColor();
		yellowHumanMan.getSex();
		yellowHumanMan.talk();
		
		yellowHumanWomen.getColor();
		yellowHumanWomen.getSex();
		yellowHumanWomen.talk();
//		human1.getColor();
//		human1.talk();
//		Human human2 = humanFactory.createHuman(WhiteHuman.class);
//		human2.getColor();
//		human2.talk();
//		Human human3 = humanFactory.createHuman(YellowHuman.class);
//		human3.getColor();
//		human3.talk();
	}
}
