package e.builder;

import java.util.ArrayList;

public class MyTest1 {
	public static void main(String[] args) {
		Director director = new Director();
		// 1����A���͵ı��۳�
		for (int i = 0; i < 10000; i++) {
			director.getABenzModel().run();
		}
		// 100����B���͵ı��۳�
		for (int i = 0; i < 1000000; i++) {
			director.getBBenzModel().run();
		}
		// 1000����C���͵ı���
		for (int i = 0; i < 10000000; i++) {
			director.getCBMWModel().run();
		}
	}
}
