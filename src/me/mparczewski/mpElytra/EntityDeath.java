/**
 * mpElytra
 * Copyright © 2020 Mikołaj Parczewski
 */

package me.mparczewski.mpElytra;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class EntityDeath implements Listener {
	
	@EventHandler
	public void onEntityDeath(EntityDeathEvent e) {
		if((e.getEntity().getType() == EntityType.SHULKER) && (new Random().nextInt(100) < 10)) e.getDrops().add(new ItemStack(Material.ELYTRA, 1));
	}
}
