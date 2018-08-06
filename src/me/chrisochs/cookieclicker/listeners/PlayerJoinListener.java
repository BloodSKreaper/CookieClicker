package me.chrisochs.cookieclicker.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

import me.chrisochs.cookieclicker.playerdata;

public class PlayerJoinListener implements Listener {
	private playerdata playerdata;

	private Plugin plugin;

	public PlayerJoinListener(Plugin pl, playerdata pldata) {
		plugin = pl;
		playerdata = pldata;
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		final PlayerJoinEvent event = e;
		plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

			@Override
			public void run() {
				playerdata.setupPlayerConfig(event.getPlayer().getUniqueId());

			}

		}, 2L);
	}
}
