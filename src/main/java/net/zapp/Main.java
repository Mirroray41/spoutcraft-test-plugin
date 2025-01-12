package net.zapp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.block.design.BlockDesign;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;

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
        Texture texture = new Texture(Main.get(), GIT_ASSETS + "texture_test.png", 8, 8, 8);
        BlockDesign design = new GenericCuboidBlockDesign(Main.get(), texture, 0, (float) 0.25, (float) 0.75, (float) 0.25, (float) 0.75, (float) 0.25, (float) 0.75);
        design.setRenderPass(1);
        design.setBoundingBox((float) 0.25, (float) 0.25, (float) 0.25, (float) 0.75, (float) 0.75, (float) 0.75);
        EXAMPLE_ITEM = new ExampleItem();
        EXAMPLE_BLOCK = new ExampleBlock(design);
    }

    public static Main get() {
        return INSTANCE;
    }
}
