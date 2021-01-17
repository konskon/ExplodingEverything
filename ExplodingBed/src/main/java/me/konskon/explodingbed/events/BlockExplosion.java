package me.konskon.explodingbed.events;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockExplosion implements Listener {

    @EventHandler
    public void blockExplosion(BlockBreakEvent e) {
        Location loc = e.getBlock().getLocation();
        World w = loc.getWorld();
        w.createExplosion(loc, 5.0F);




    }


}
