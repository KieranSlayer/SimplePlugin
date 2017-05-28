package me.kieranslayer.sp;

import java.util.logging.Logger;
import me.kieranslayer.sp.commands.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin 
                  implements Listener{
	
	PluginDescriptionFile pdfFile;
	Logger logger;
	
  public void onEnable(){
	  pdfFile  = this.getDescription();
	  logger = Logger.getLogger("minecraft");
	  this.registerCommands();
	  this.getConfig().options().copyDefaults(true);
	  this.saveConfig();
	  logger.info(pdfFile.getName() + "has been Enabled");
  }

  private void registerCommands() {
	this.getCommand("hello").setExecutor(new Hello(this));
	this.getCommand("spdev").setExecutor(new Developer(this));
	
}
  
  public void onDisable(){
	  logger = Logger.getLogger("minecraft");
	  this.saveConfig();
	  logger.info(pdfFile.getName() + "has been Disabled");
	

}
  
}
