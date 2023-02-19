package com.theracraft.firstproject;

import org.bukkit.plugin.java.JavaPlugin;

public final class Slushiscool extends JavaPlugin {

    test testClassInstance = new test();

    @Override
    public void onEnable() {
        // Plugin startup logic
        String yourName = "Slush";
        char firstLetter = 'S';
        System.out.println(firstLetter);
        char lastLetter = yourName.charAt(yourName.length() - 1);
        System.out.println(firstLetter);

        int a = 1; //smaller than a double but bigger than a byte.
        //Int b = 1.1; //This is an invalid integer. This line is commented out as well.
        double c = 1.1; //Bigger than an integer but smaller than a float.
        float d = 1.1F; //Really huge.
        byte e = 1; //Smallest data type for numbers.

        boolean f = true;
        boolean g = false;
        int x =0;
        if (0 == 2) {
            x = 100;
            System.out.println("Variable a is equal to 2. ");
        } else {
            System.out.println("Variable a is not equal to 2.");
        }
    }

    public void functionOne(String s, String boo){
        String temp = s;
        s = boo;
        boo = temp;
        System.out.println(s + boo);
    }

    private String functionTwo(String s){
        return s;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        testClassInstance = null;
    }
}
