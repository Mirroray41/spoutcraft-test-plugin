package net.zapp;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class ExampleBlock extends GenericCubeCustomBlock {
    static Texture texture = new Texture(Main.get(), "https://i.ibb.co/sCFvQBD/q6wBozz.png", 32, 16, 16);
    public ExampleBlock() {
        super(Main.get(), "exampleblock", new GenericCubeBlockDesign(Main.get(), texture, 0));
        setName("Example Block");
    }
}