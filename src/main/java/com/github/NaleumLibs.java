package com.github;

import org.bukkit.plugin.java.JavaPlugin;

public final class NaleumLibs extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("nlreload").setExecutor(new Commands());
    }
}
