package net.zapp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main INSTANCE;
    public static String GIT_ASSETS = "https://raw.githubusercontent.com/Mirroray41/spoutcraft-test-plugin/refs/heads/main/src/main/resources/assets/";

    public Main() {
        INSTANCE = this;
    }

    public ExampleItem EXAMPLE_ITEM;
    public ExampleBlock EXAMPLE_BLOCK;

    @Override
    public void onEnable() {
        // The item needs to be initialised somewhere. Add as variable to this class so it can be referenced to add to inventories
        EXAMPLE_ITEM = new ExampleItem();
        EXAMPLE_BLOCK = new ExampleBlock();
    }

    public static Main get() {
        return INSTANCE;
    }
}
