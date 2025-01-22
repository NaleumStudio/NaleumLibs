package com.github;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.NLSTUDIO.Java;
import com.github.NLSTUDIO.Hologram;

public final class NaleumLibs extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    /*test
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {

        if (event.getHand() != EquipmentSlot.HAND) return;

        Player player = event.getPlayer();
        Location location = player.getLocation().add(0, 2, 0); // 플레이어의 머리 위 2블록

        Hologram test = new Hologram.Builder()
                .location(player.getLocation().add(0, 2, 0))
                .text("hello world")
                .gravity(false)
                .build();
        test.create();
        player.sendMessage("Hologram created at: ");
    }*/
}
