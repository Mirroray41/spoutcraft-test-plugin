package net.zapp;

import org.getspout.spoutapi.block.design.BlockDesign;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;


public class ExampleBlock extends GenericCuboidCustomBlock {
    public ExampleBlock(BlockDesign design) {
        super(Main.get(), "exampleblock", 20, (GenericCuboidBlockDesign) design);
        setName("Example Block");
        setOpaque(false);
    }
}