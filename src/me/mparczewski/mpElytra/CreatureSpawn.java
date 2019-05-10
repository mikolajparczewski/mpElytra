/**
 * kElytra
 * Copyright © 2019 Mikołaj Parczewski
 */

package me.mparczewski.mpElytra;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.potion.PotionEffectType;

public class CreatureSpawn implements Listener {

	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent e) {
		
		if(e.getEntity().getType() == EntityType.SHULKER) {
			
			e.getEntity().removePotionEffect(PotionEffectType.INVISIBILITY);
			
		}
		
	}

}
