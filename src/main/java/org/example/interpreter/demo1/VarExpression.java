package org.example.interpreter.demo1;

import java.util.HashMap;

public class VarExpression extends Expression {
    private String key;

    public VarExpression(String _key) {
        this.key = _key;
    }

    //从map中取之
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}