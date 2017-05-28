package me.kieranslayer.sp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.kieranslayer.sp.Main;

public class Developer implements CommandExecutor{
	
	Player player;
	private Main Plugin;
	public Developer(Main pl)
	{
		
	}
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		{
			if ((label.equalsIgnoreCase("spdev")) &&
					(!(sender instanceof Player))) {
				return false;
			}
		}
		player = (Player)sender;
		player.sendMessage("This PLugin was Coded By KieranSlayer");
		return false;
	}
	public Main getPlugin() {
		return Plugin;
	}
	public void setPlugin(Main plugin) {
		Plugin = plugin;
	}

}
