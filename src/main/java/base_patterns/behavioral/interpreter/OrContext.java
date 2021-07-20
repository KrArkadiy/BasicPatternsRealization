package main.java.base_patterns.behavioral.interpreter;

public class OrContext implements Expression{
    Expression expression;
    Expression expression1;

    public OrContext(Expression expression, Expression expression1){
        this.expression = expression;
        this.expression1 = expression1;
    }

    @Override
    public boolean interpret(String context) {
        return expression.interpret(context) || expression1.interpret(context);
    }
}
