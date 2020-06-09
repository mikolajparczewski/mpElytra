/**
 * mpElytra
 * Copyright © 2020 Mikołaj Parczewski
 */

package me.mparczewski.mpElytra;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LingeringPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

public class ProjectileHit implements Listener {
	
	@EventHandler
	public void onProjectileHit(ProjectileHitEvent e) {
		if(e.getHitBlock() != null && e.getHitBlock().getType() == Material.DIAMOND_BLOCK) {
			if(e.getEntity().getType() == EntityType.LINGERING_POTION) {
				LingeringPotion potion = (LingeringPotion) e.getEntity();
				if(potion.getItem().getItemMeta() instanceof PotionMeta) {
					final PotionMeta meta = (PotionMeta) potion.getItem().getItemMeta();
					final PotionData data = meta.getBasePotionData();
					if(data.getType() == PotionType.INVISIBILITY) {
						e.getHitBlock().getLocation().getBlock().setType(Material.AIR);
						World world = e.getHitBlock().getLocation().getWorld();
						world.spawnEntity(e.getHitBlock().getLocation(), EntityType.SHULKER);
					}
				}
			}
		}
	}
}
