package com.replantedtech.plugins;

import org.bukkit.plugin.java.JavaPlugin;

public class SnowballRoulette extends JavaPlugin {

    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new SnowballListener(), this);
    }
    
    @Override
    public void onDisable() {

    }
}