package com.github;

import com.github.event.NaleumListener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, Command command, @NotNull String sting, String[] strings) {
        if (command.getName().equalsIgnoreCase("nlreload")) {
            NaleumListener.triggerNaleumLibsReload();
            return true;
        }
        return false;
    }
}