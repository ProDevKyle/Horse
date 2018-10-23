package com.company;

public interface Horse
{
    class unicorn extends HorseRunner
    {
        private String name;
        private int weight;

        public unicorn(String name, int weight)
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
}