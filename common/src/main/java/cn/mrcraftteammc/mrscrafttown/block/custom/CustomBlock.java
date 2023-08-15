package cn.mrcraftteammc.mrscrafttown.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class CustomBlock extends Block {
    public CustomBlock() {
        super(Block.Properties.of().sound(SoundType.ANVIL));
    }
}
