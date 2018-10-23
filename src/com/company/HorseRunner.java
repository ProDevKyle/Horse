package com.company;

public class HorseRunner
{
    public static void main(String[] args)
    {
        Horse horse1 = new unicorn("Secretariat", 12000);
        Horse horse2 = new unicorn("Duty Trail", 22000);
        Horse horse3 = new unicorn("Silver", 12000);

        Horse[] horses = new Horse[6];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println(" Dusty Trail is in space: ") + barn.findHorseSpace("Dusty Trail"));

        barn.conslidate();

        System.out.println(barn);
        System.out.println(" Dusty Trail is now in space: ") + barn.findHorseSpace("Dusty Trail"));
    }
}
