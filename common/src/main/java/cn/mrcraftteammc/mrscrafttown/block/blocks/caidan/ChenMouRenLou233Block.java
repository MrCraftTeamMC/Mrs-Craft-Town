package cn.mrcraftteammc.mrscrafttown.block.blocks.caidan;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ChenMouRenLou233Block extends Block {
    public ChenMouRenLou233Block() {
        super(BlockBehaviour.Properties.of().sound(SoundType.BAMBOO).strength(2.0F,3.5F).mapColor(MapColor.COLOR_YELLOW));
    }
}
