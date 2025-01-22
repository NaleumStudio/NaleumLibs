package com.github.NLSTUDIO;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;

public class Hologram {
    private Location location;
    private String text;
    private final boolean gravity;
    private ArmorStand entity;

    private Hologram(Builder builder) {
        this.location = builder.location;
        this.text = builder.text;
        this.gravity = builder.gravity;
    }

    public void create() {
        World world = this.location.getWorld();
        if (world == null) { return; }
        this.entity = (ArmorStand) world.spawnEntity(this.location, EntityType.ARMOR_STAND);
        this.entity.setCustomName(this.text);
        this.entity.setCustomNameVisible(true);
        this.entity.setInvisible(true);
        this.entity.setGravity(this.gravity);
    }

    public void destroy() {
        if (this.entity != null && !this.entity.isDead()) {
            this.entity.remove();
            this.entity = null;
        }
    }

    public void setText(String text) {
        if (this.entity != null && !this.entity.isDead()) {
            this.entity.setCustomName(text);
            this.text = text;
        }
    }

    public void setLocation(Location location) {
        if (this.entity != null && !this.entity.isDead()) {
            this.entity.teleport(location);
            this.location = location;
        }
    }

    public ArmorStand getInstance() {
        return this.entity;
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
