package io.github.niclude.shakerplugin.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

// TODO: Fix this boilerplate shitcode.
public class StainedGlassPaneRecipes {
    private static void addWhite(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)0);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "white_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short)15);
        Bukkit.addRecipe(recipe);
    }

    private static void addOrange(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)1);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "orange_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short)14);
        Bukkit.addRecipe(recipe);
    }

    private static void addMagenta(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)2);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "magenta_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short)13);
        Bukkit.addRecipe(recipe);
    }

    private static void addLightBlue(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)3);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "light_blue_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short)12);
        Bukkit.addRecipe(recipe);
    }

    private static void addYellow(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)4);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "yellow_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short) 11);
        Bukkit.addRecipe(recipe);
    }

    private static void addLime(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)5);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "lime_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short) 10);
        Bukkit.addRecipe(recipe);
    }

    private static void addPink(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)6);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "pink_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short) 9);
        Bukkit.addRecipe(recipe);
    }

    private static void addGray(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)7);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "gray_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short) 8);
        Bukkit.addRecipe(recipe);
    }

    private static void addLightGray(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)8);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "light_gray_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short) 7);
        Bukkit.addRecipe(recipe);
    }

    private static void addCyan(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)9);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "cyan_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short) 6);
        Bukkit.addRecipe(recipe);
    }

    private static void addPurple(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)10);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "purple_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short) 5);
        Bukkit.addRecipe(recipe);
    }

    private static void addBlue(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)11);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "blue_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short) 4);
        Bukkit.addRecipe(recipe);
    }

    private static void addBrown(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)12);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "brown_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short) 3);
        Bukkit.addRecipe(recipe);
    }

    private static void addGreen(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)13);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "green_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short) 2);
        Bukkit.addRecipe(recipe);
    }

    private static void addRed(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)14);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "red_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short) 1);
        Bukkit.addRecipe(recipe);
    }

    private static void addBlack(Plugin plugin) {
        ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE);
        item.setDurability((short)15);
        item.setAmount(8);

        NamespacedKey key = new NamespacedKey(plugin, "black_stained_glass_pane");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("GGG", "GDG", "GGG");
        recipe.setIngredient('G', Material.THIN_GLASS);
        recipe.setIngredient('D', Material.INK_SACK, (short) 0);
        Bukkit.addRecipe(recipe);
    }

    public static void addRecipes(Plugin plugin) {
        addWhite(plugin);
        addOrange(plugin);
        addMagenta(plugin);
        addLightBlue(plugin);
        addYellow(plugin);
        addLime(plugin);
        addPink(plugin);
        addGray(plugin);
        addLightGray(plugin);
        addCyan(plugin);
        addPurple(plugin);
        addBlue(plugin);
        addBrown(plugin);
        addGreen(plugin);
        addRed(plugin);
        addBlack(plugin);
    }
}
