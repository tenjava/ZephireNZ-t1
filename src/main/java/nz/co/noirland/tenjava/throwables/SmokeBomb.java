package nz.co.noirland.tenjava.throwables;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class SmokeBomb extends ItemStack {

    public static final String SMOKE_BOMB_NAME = ChatColor.GOLD + "Smoke Bomb";
    public static final ArrayList<String> lore = new ArrayList<String>();

    static {
        lore.add("Throw the smoke bomb on the");
        lore.add("ground and daze your foes!");
    }

    public SmokeBomb() {
        super(Material.SNOW_BALL, 1, (short) 16);
        ItemMeta meta = getItemMeta();

        meta.setDisplayName(SMOKE_BOMB_NAME);
        meta.setLore(lore);
        setItemMeta(meta);
    }

}
