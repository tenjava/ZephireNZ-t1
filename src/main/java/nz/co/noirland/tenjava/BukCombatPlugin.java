package nz.co.noirland.tenjava;

import nz.co.noirland.tenjava.hardness.CloakListener;
import nz.co.noirland.tenjava.hardness.HardnessListener;
import nz.co.noirland.tenjava.throwables.FlashBang;
import nz.co.noirland.tenjava.throwables.SmokeBomb;
import nz.co.noirland.tenjava.throwables.ThrowablesListener;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class BukCombatPlugin extends JavaPlugin {

    private static BukCombatPlugin inst;

    public static final String HARDNESS_NAME = ChatColor.GRAY + "Hardness I";
    public static final String CLOAK_NAME = ChatColor.GRAY + "Cloak I";

    public static BukCombatPlugin inst() {
        return inst;
    }

    @Override
    public void onEnable() {
        inst = this;
        getServer().getPluginManager().registerEvents(new HardnessListener(), this);
        getServer().getPluginManager().registerEvents(new ThrowablesListener(), this);
        getServer().getPluginManager().registerEvents(new CloakListener(), this);
        addRecipes();
    }

    public void addRecipes() {
        ShapelessRecipe smoke = new ShapelessRecipe(new SmokeBomb());
        smoke.addIngredient(1, Material.PAPER);
        smoke.addIngredient(3, Material.SULPHUR);
        smoke.addIngredient(2, Material.SUGAR);
        getServer().addRecipe(smoke);

        ShapelessRecipe flash = new ShapelessRecipe(new FlashBang());
        flash.addIngredient(1, Material.PAPER);
        flash.addIngredient(3, Material.SULPHUR);
        flash.addIngredient(1, Material.GLOWSTONE_DUST);
        flash.addIngredient(1, Material.REDSTONE);
        getServer().addRecipe(flash);
    }

}
