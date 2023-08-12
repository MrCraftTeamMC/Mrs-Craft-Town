package cn.tlscstudios.easiertravelcraft.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class CommonBlock extends Block {
    public CommonBlock() {
        super(Block.Properties.of(Material.STONE).sound(SoundType.ANVIL));
    }
}
