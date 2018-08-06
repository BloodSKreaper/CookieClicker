package me.chrisochs.cookieclicker.listeners;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.block.Skull;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.chrisochs.cookieclicker.Main;

public class PlayerInteractEventListener implements Listener {

	private Main main;

	public PlayerInteractEventListener(Main main) {
		this.main = main;
	}

	@EventHandler
	public void onClick(PlayerInteractEvent e) {
		if (e.getAction() == Action.LEFT_CLICK_BLOCK && e.getClickedBlock().getType().equals(Material.SKULL)) {
			Skull skull = (Skull) e.getClickedBlock().getState();
			if (skull.getSkullType().equals(SkullType.PLAYER)) {
				if (skull.getOwner().equals("QuadratCookie")) {
					main.handleClick(e.getPlayer(), e.getClickedBlock().getLocation());
				}
			}
		}

	}

}
