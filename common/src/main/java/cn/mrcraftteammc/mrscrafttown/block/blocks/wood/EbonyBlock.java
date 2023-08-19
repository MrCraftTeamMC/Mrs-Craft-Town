package cn.mrcraftteammc.mrscrafttown.block.blocks.wood;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class EbonyBlock extends Block {
    public EbonyBlock() {
        super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2.0F, 4.0F).mapColor(MapColor.COLOR_BLACK)); //Custom something needed
    }
}
