package w.calculator;

import java.util.HashMap;
import java.util.Stack;

/**
 * ������ģʽ������һ�����ԣ����������ķ���һ�ֱ�ʾ��������һ�����������ý�����ʹ�øñ�ʾ�����������е����
 * 
 * ������ģʽ���ŵ㣺
 * 1�����õ���չ�ԣ��޸��﷨����ֻҪ�޸���Ӧ��������Ϳ�����
 * 
 * ������ģʽ��ȱ�㣺
 * 1�����������
 * 2��Ч�����⣬ʹ���˴����ĵݹ��ѭ����Ч�ʵ���
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
