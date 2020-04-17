package com.replantedtech.plugins;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;

public class SnowballListener implements Listener {
	
	@EventHandler
	public void onDrop(ProjectileHitEvent event) {
		Projectile projectile = event.getEntity();
		double random;
		int i = 0;
		if (projectile instanceof Snowball) {
			random = Math.random();
			ItemStack goldenapple = new ItemStack(Material.GOLDEN_APPLE);
			if (random >= 0.0 && random <= 0.1) {
				projectile.getWorld().createExplosion(projectile.getLocation(), 4F);
			}
			else if (random > 0.1 && random <= 0.3) {
				while (i < 3) {
					i = i + 1;
					projectile.getWorld().strikeLightning(projectile.getLocation());
					projectile.getWorld().playEffect(projectile.getLocation(), Effect.SMOKE, 3);
				}
			}
			else if (random > 0.3 && random <= 0.5) {
				projectile.getWorld().playEffect(projectile.getLocation(), Effect.GHAST_SHRIEK, 2);
			}
			else if (random > 0.5 && random <= 0.6) {
				projectile.getWorld().dropItem(projectile.getLocation(), goldenapple);
			}
			else if (random > 0.6 && random <= 0.7) {
				projectile.getWorld().spawnEntity(projectile.getLocation(), EntityType.PANDA);
			}
			else if (random > 0.7 && random <= 0.8) {
				projectile.getWorld().spawnEntity(projectile.getLocation(), EntityType.PILLAGER);
			}
			else if (random > 0.8) {
				projectile.getWorld().spawnEntity(projectile.getLocation(), EntityType.LLAMA);
			}
		}
	}
}
