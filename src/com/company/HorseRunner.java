package com.company;

public class HorseRunner
{
    public static void main(String[] args)
    {
        Horse horse1 = new Unicorn("Secretariat", 12000);
        Horse horse2 = new Unicorn("Dusty Trail", 22000);
        Horse horse3 = new Unicorn("Silver", 12000);

        Horse horse4 = new Ponies("Catelen", 10000);
        Horse horse5 = new Ponies("Kyle", 10000);
        Horse horse6 = new Ponies("James", 10000);

        Horse[] horses = new Horse[12];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        horses[7] = horse4;
        horses[9] = horse5;
        horses[11] = horse6;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println(" Dusty Trail is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Dusty Trail is now in space: " + barn.findHorseSpace("Dusty Trail"));
    }
}
