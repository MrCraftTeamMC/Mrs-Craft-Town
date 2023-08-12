package cn.tlscstudios.easiertravelcraft.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class CustomBlock extends Block {
    public CustomBlock() {
        super(Properties.of(Material.STONE).sound(SoundType.ANVIL));
    }
}
