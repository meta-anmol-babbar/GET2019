package question1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExpressionEvaluationTest {
	
	@Test
	public void testConversion()
	{
		String infixExpression = "( 1 + 2 ) * ( 3 + 4 )";
		ExpressionEvaluation evaluationObject = new ExpressionEvaluation(infixExpression);
		String postfixExpression = evaluationObject.infixToPostfix();
		String expectedPostfixExpression = "1 2 + 3 4 + * ";
		assertEquals(expectedPostfixExpression, postfixExpression);
	}

	@Test
	public void testEvaluation()
	{
		String infixExpression = "( 1 + 2 ) * ( 3 + 4 )";
		ExpressionEvaluation evaluationObject = new ExpressionEvaluation(infixExpression);
		String postfixExpression = evaluationObject.infixToPostfix();
		assertEquals(21, evaluationObject.evaluateExpression(postfixExpression));
	}
}
