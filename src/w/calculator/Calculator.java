package w.calculator;

import java.util.HashMap;
import java.util.Stack;

/**
 * 解释器模式：给定一门语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的语句
 * 
 * 解释器模式的优点：
 * 1）良好的拓展性，修改语法规则只要修改相应的运算符就可以了
 * 
 * 解释器模式的缺点：
 * 1）造成类膨胀
 * 2）效率问题，使用了大量的递归和循环，效率低下
 * @author yyl-pc
 *
 */
public class Calculator {
	private Expression expression;
	public Calculator(String expStr) {
		Stack<Expression> stack = new Stack<Expression>();
		char[] strs = expStr.toCharArray();
		Expression left = null;
		Expression right = null;
		for(int i=0;i<strs.length;i++) {
			switch(strs[i]) {
				case '+':
					left = stack.pop();
					right = new VarExpression(String.valueOf(strs[++i]));
					stack.push(new AddExpression(left,right));
					break;
				case '-':
					left = stack.pop();
					right = new VarExpression(String.valueOf(strs[++i]));
					stack.push(new SubExpression(left,right));
					break;
				default :
					stack.push(new VarExpression(String.valueOf(strs[i])));
			}
		}
		this.expression = stack.pop();
	}
	public int run(HashMap<String,Integer> var) {
		return this.expression.interpreter(var);
	}
}
