/**
 * mpElytra
 * Copyright © 2019 Mikołaj Parczewski
 */

package me.mparczewski.mpElytra;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(new ProjectileHit(), this);
		getServer().getPluginManager().registerEvents(new CreatureSpawn(), this);
		getServer().getPluginManager().registerEvents(new EntityDeath(), this);
		
	}

}
