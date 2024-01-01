package io.github.niclude.shakerplugin.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

public class StainedGlassPaneRecipes {
    private static String[] namespacedKeys = {
        "white_stained_glass_pane",
        "orange_stained_glass_pane",
        "magenta_stained_glass_pane",
        "light_blue_stained_glass_pane",
        "yellow_stained_glass_pane",
        "lime_stained_glass_pane",
        "pink_stained_glass_pane",
        "gray_stained_glass_pane",
        "light_gray_stained_glass_pane",
        "cyan_stained_glass_pane",
        "purple_stained_glass_pane",
        "blue_stained_glass_pane",
        "brown_stained_glass_pane",
        "green_stained_glass_pane",
        "red_stained_glass_pane",
        "black_stained_glass_pane"
    };

    private static void addRecipe(Plugin plugin, short paneColorId, String namespacedKey) {
        short dyeColorId = (short) (15 - paneColorId);

        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability(paneColorId);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, namespacedKey);
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, dyeColorId);
        Bukkit.addRecipe(recipe);
    }

    public static void addRecipes(Plugin plugin) {
        for (int i = 0; i <= 15; i++) {
            addRecipe(plugin, (short)i, namespacedKeys[i]);
        }
    }
}
