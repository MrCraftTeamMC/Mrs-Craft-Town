package cn.mrcraftteammc.mrscrafttown.block.blocks.caidan;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class MrZmh5Block extends Block {
    public MrZmh5Block() {
        super(BlockBehaviour.Properties.of().sound(SoundType.ANVIL).strength(2.5F,5.0F).mapColor(MapColor.COLOR_BLACK));
    }
}
