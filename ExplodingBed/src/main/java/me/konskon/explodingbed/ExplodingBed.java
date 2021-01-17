package me.konskon.explodingbed;

import me.konskon.explodingbed.events.*;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExplodingBed extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("The plugin is gay");
        getServer().getPluginManager().registerEvents(this,this);
        getServer().getPluginManager().registerEvents(new MobExplode(), this);
        getServer().getPluginManager().registerEvents(new SoupHealsYou(), this);
        getServer().getPluginManager().registerEvents(new SheerSheepExplosion(),this);
        getServer().getPluginManager().registerEvents(new TheConsoleResponds(), this);
        getServer().getPluginManager().registerEvents(new BlockExplosion(), this);
    }

            @EventHandler
            public void onSleepBed(PlayerBedEnterEvent event){
               Location loc = event.getBed().getLocation();
               World w = loc.getWorld();
               w.createExplosion(loc, 3.0F);
               System.out.println(ChatColor.RED + "GO DIE");

            }
        }




