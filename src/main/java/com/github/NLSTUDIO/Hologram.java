package com.github.NLSTUDIO;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;

public class Hologram {
    private final Location location;
    private final String text;
    private final boolean gravity;

    private Hologram(Builder builder) {
        this.location = builder.location;
        this.text = builder.text;
        this.gravity = builder.gravity;
    }

    public void create() {
        World world = this.location.getWorld();
        if (world == null) { return; }
        ArmorStand armorStand = (ArmorStand) world.spawnEntity(this.location, EntityType.ARMOR_STAND);
        armorStand.setCustomName(this.text);
        armorStand.setCustomNameVisible(true);
        armorStand.setInvisible(true);
        armorStand.setGravity(this.gravity);
    }

    public static class Builder {
        private Location location;
        private String text = null;
        private Boolean gravity = false;

        public Builder location(Location location) {
            this.location = location;
            return this;
        }
        public Builder text(String text) {
            this.text = text;
            return this;
        }
        public Builder gravity(boolean gravity) {
            this.gravity = gravity;
            return this;
        }
        public Hologram build() {
            return new Hologram(this);
        }
    }
}
