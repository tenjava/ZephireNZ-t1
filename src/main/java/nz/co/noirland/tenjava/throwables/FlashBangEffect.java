package nz.co.noirland.tenjava.throwables;

import nz.co.noirland.tenjava.Util;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FlashBangEffect {

    public FlashBangEffect(Location bang) {
        Util.smokeEffect(bang);
        for(Entity e : Util.entitiesInRadius(bang, 7)) {
            if(!(e instanceof LivingEntity)) continue;
            LivingEntity le = (LivingEntity) e;
            le.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 8 * 20, 1, true));
            le.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 6 * 20, 1, true));
            le.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6 * 20, 3, true));
        }
    }
}
