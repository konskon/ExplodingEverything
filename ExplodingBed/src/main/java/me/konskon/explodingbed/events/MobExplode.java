package me.konskon.explodingbed.events;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class MobExplode implements Listener {


    @EventHandler
    public void mobExplode(EntityDeathEvent event) {

        Location loc = event.getEntity().getLocation();
        World w = loc.getWorld();
        w.createExplosion(loc,3.0F);


    }


}
