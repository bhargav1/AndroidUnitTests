package com.mobiquity.androidunittests.calculator.input.operator;

import com.mobiquity.androidunittests.calculator.input.Input;
import com.mobiquity.androidunittests.calculator.input.InputType;

/**
 * A dummy operator that just returns the value of the first parameter
 */
public class NoOpOperator extends Operator {
    public NoOpOperator() {
        super("", InputType.OPERATOR);
    }

    @Override
    public int execute(int param1, int param2) {
        return param1;
    }

    @Override
    public int getPrecedence() {
        return 0;
    }

    @Override
    public boolean isLeftAssociative() {
        return true;
    }

}