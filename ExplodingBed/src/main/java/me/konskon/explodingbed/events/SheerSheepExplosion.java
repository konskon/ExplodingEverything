package me.konskon.explodingbed.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class SheerSheepExplosion implements Listener {

    @EventHandler
    public void sheerSheepExplosion(PlayerShearEntityEvent event) {
        Location loc = event.getEntity().getLocation();
        World w = loc.getWorld();
        w.createExplosion(loc,5.0F);
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.RED +"GO DIE!!!!!");
    }


}
