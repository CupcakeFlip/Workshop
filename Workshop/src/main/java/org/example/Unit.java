package org.example;

import java.util.UUID;

public class Unit
{
    private String name;
    private UUID id;

    public UUID getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Building id: " + id + " Name of building " + name ;
    }

}
