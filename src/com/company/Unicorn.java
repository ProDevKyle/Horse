package com.company;

public class Unicorn implements Horse
{
    private String name;
    private int weight;

    public Unicorn(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }
    public String getName()
    {
        return this.name;
    }
    public int getWeight()
    {
        return this.weight;
    }
}

