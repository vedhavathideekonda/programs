package spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SPEL {
	
	    public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		//operators in SPEL
		
		//-----arithmetic operator-----
		System.out.println(parser.parseExpression("'Welcome.....'+'!'").getValue());
		System.out.println(parser.parseExpression("5 * 6/2").getValue());
		System.out.println(parser.parseExpression("'Today is: '+ new java.util.Date()").getValue());

		//------logical operator------
		System.out.println(parser.parseExpression("true and false").getValue());

		//-------Relational operator-----
		System.out.println(parser.parseExpression("'vedhavathi'.length()==10").getValue());
		}
}
