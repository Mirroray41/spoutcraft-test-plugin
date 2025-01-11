package net.zapp;

import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

import static net.zapp.Main.GIT_ASSETS;

public class ExampleBlock extends GenericCuboidCustomBlock {
    static Texture texture = new Texture(Main.get(), GIT_ASSETS + "texture_test.png", 6, 6, 6);
    public ExampleBlock() {
        super( Main.get(), "exampleblock", 85, (GenericCuboidBlockDesign) new GenericCuboidBlockDesign(Main.get(), texture, 0, (float) 0.3125, (float) 0.6875, (float) 0.3125, (float) 0.6875, (float) 0.3125, (float) 0.6875).setRenderPass(1));
        setName("Example Block");
    }
}