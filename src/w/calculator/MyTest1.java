package w.calculator;

import java.util.HashMap;

public class MyTest1 {
	public static void main(String[] args) {
		String expression = "a+b+b+c-d";
		Calculator lator = new Calculator(expression);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("a", 1);
		map.put("b", 3);
		map.put("c", 4);
		map.put("d", 5);
		System.out.println(lator.run(map));
	}
}
