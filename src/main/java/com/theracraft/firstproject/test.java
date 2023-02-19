package com.theracraft.firstproject;

import org.bukkit.plugin.java.JavaPlugin;

public class test {

    Slushiscool instance = JavaPlugin.getPlugin(Slushiscool.class);


    public void testFunction(){
        instance.functionOne("Whatever I want to call this", "boo");
    }
}
