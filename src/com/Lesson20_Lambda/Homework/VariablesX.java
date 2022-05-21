package com.Lesson20_Lambda.Homework;

import java.util.Objects;

public class VariablesX {

    private int variable;

    public VariablesX(int variable) {
        this.variable = variable;
    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariablesX that = (VariablesX) o;
        return variable == that.variable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(variable);
    }

    @Override
    public String toString() {
        return "VariablesX{" +
                "variable=" + variable +
                '}';
    }
}
