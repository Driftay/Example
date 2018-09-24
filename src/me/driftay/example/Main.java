package me.driftay.example;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable(){
        Bukkit.getConsoleSender().sendMessage("hi this is my example");
    }

    public void onDisable(){


    }
}
