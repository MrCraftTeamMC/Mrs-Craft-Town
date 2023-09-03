package cn.mrcraftteammc.mrscrafttown.block.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class MrCTBaseBlocks extends Block {
    public MrCTBaseBlocks(MapColor mapColor, NoteBlockInstrument noteBlockInstrument, float destroyTime, float explosionResistance, SoundType soundType) {
        super(BlockBehaviour.Properties.of().mapColor(mapColor).instrument(noteBlockInstrument).strength(destroyTime, explosionResistance).sound(soundType).requiresCorrectToolForDrops());
    }
}
