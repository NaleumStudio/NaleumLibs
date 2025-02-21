package com.github;

import com.github.event.NaleumLibsListener;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("nlreload")) {
            NaleumLibsListener.onNaleumLibsReloadTrigger();
            return true;
        }
        return false;
    }
}