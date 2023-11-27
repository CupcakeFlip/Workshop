package org.example;

public class VentilationActuactor extends Actuator
{
    @Override
    public void setValue(double value) {
        super.setValue(value);
    }

    @Override
    public String toString()
    {
        return "" + getValue();
    }
}
