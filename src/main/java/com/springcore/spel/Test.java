package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("spelConfig.xml");
        Demo d1 = (Demo) con.getBean("demo");
        System.out.println(d1);

        // Expression parser API usage
        SpelExpressionParser temp = new SpelExpressionParser();
        Expression exp = temp.parseExpression("22+22");
        System.out.println(exp.getValue());
    }
}
