package question1;

public class StackOperations {

	String[] stringArray;
	StringBuffer postfixExpression = new StringBuffer();
	Stack tempStack = new Stack();

	protected void infixToPostfix(String infixExpression) {

		stringArray = infixExpression.split(" ");

		for (String string : stringArray) {
			switch (string) {

			case "(":
			case ")":
			case "+":
			case "-":
			case "*":
			case "/":
			case "%":
			case "==":
			case "!=":
			case ">=":
			case "<=":
			case ">":
			case "<":
			case "&&":
			case "||":
			case "!":
				converseion(string);
				break;
			default:
				postfixExpression.append(string);
				break;

			}
			System.out.println(postfixExpression.toString());
		}
	}

	private void converseion(String string) {
		if (tempStack.isEmpty()) {
			tempStack.push(string);
		} else if ("(".equals(string)) {
			tempStack.push(string);
		} else if (")".equals(string)) {
			while (!"(".equals(tempStack.peek())) {
				postfixExpression.append(tempStack.peek());
				tempStack.pop();
			}
		} else if (Precedence.precedence.get(tempStack.peek()) < Precedence.precedence
				.get(string)) {
			while (!"(".equals(tempStack.peek())
					|| Precedence.precedence.get(tempStack.peek()) < Precedence.precedence
							.get(string)) {
				postfixExpression.append(tempStack.peek());
				tempStack.pop();
			}
		}

	}

}
