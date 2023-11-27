package org.example;

import java.util.UUID;

public class CO2Sensor extends Sensors{
    private UUID id;
    @Override
    public double getValue() {
        return super.getValue();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public CO2Sensor (double value, UUID id)
    {
        this.id = id;
        this.value = value;
    }
}

