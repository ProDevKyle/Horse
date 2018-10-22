package com.company;

public class HorseBarn
{
    private Horse[]spaces;
    public int findHorseSpace(String name)
    {
        for(int i = 0; i < this.spaces.length; i++)
        {
            if(this.spaces[i] != null && name.equals(this.spaces[i].getName()))
            {
                return i;
            }
            else
            {
                return -1;
            }
        }
    }
}
