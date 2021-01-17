package me.konskon.explodingbed.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.server.BroadcastMessageEvent;

public class TheConsoleResponds implements Listener {

    @EventHandler
    public void theConsoleResponds(PlayerItemConsumeEvent e) {
        Player p = e.getPlayer();
        if(e.getItem().getType()== Material.MUSHROOM_STEW) {
            p.setHealth(20.0);


        }



    }




}
