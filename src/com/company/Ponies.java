package com.company;

public class Ponies implements Horse
{
    private String name;
    private int weight;

    public Ponies(String name, int weight)
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