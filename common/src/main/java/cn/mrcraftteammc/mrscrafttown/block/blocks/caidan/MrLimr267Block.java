package cn.mrcraftteammc.mrscrafttown.block.blocks.caidan;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class MrLimr267Block extends Block {
    public MrLimr267Block() {
        super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2.5F,4.5F).mapColor(MapColor.COLOR_LIGHT_BLUE));
    }
}
