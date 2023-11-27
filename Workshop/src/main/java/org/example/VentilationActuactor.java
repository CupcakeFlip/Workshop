package org.example;

import java.util.UUID;

public class VentilationActuactor extends Actuator
{
    public VentilationActuactor(UUID id)
    {
        super(id);
    }

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
