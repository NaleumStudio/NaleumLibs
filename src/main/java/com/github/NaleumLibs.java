package com.github;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class NaleumLibs extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        this.getCommand("nlreload").setExecutor(new Commands());
    }
}
