package org.example.AssignmentQ7;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {

        ExpressionParser expressionParser = new SpelExpressionParser();

        Expression expression = expressionParser.parseExpression("'Hello my name is Ayush Agrawal'");
        String message = (String) expression.getValue();
        System.out.println(message);

        Expression expression1 = expressionParser.parseExpression(String.valueOf(22+33));
        int ans = (int) expression1.getValue();
        System.out.println(ans);
    }
}
