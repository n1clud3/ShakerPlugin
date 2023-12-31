package io.github.niclude.shakerplugin;

import io.github.niclude.shakerplugin.recipes.StainedGlassPaneRecipes;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShakerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        StainedGlassPaneRecipes.addRecipes(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
