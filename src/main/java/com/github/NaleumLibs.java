package com.github;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class NaleumLibs extends JavaPlugin implements Listener, NaleumLibsListener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        this.getCommand("nlreload").setExecutor(new Commands());
        NaleumEventListener.eventRegister(this);
    }

    @Override
    public void onNaleumLibsReload() {
        System.out.println("✅ NaleumLibs가 리로드되었습니다!");
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
