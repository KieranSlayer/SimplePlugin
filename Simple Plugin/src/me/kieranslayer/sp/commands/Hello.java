package me.kieranslayer.sp.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.kieranslayer.sp.Main;

public class Hello implements CommandExecutor{
	
	Player player;
	private Main Plugin;
	public Hello(Main pl)
	{
		
	}
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		{
			if ((label.equalsIgnoreCase("hello")) &&
					(!(sender instanceof Player))) {
				return false;
			}
		}
		player = (Player)sender;
		player.sendMessage(ChatColor.translateAlternateColorCodes('&',Plugin.getConfig().getString("Hello")));
		return false;
	}
	public Main getPlugin() {
		return Plugin;
	}
	public void setPlugin(Main plugin) {
		Plugin = plugin;
	}

}
