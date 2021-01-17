package me.konskon.explodingbed.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.Material.*;

public class SoupHealsYou implements Listener {

    @EventHandler
    public void soupHealsYou(ProjectileHitEvent e) {
        Location loc = e.getHitBlock().getLocation();
        World w = loc.getWorld();
        w.createExplosion(loc, 5.0F);

    }

}
