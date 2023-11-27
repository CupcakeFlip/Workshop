package org.example;

import java.util.ArrayList;
import java.util.UUID;

public class Actuator extends Unit
{
    private double value;
    private UUID Id;

    public Actuator(UUID id){

        Id=id;
        value=0;
    }

    public UUID getid(){
        return Id;
    }
    public void setValue (double value)
    {
        this.value = value;
    }

    public double getValue()
    {
        return value;
    }


}
