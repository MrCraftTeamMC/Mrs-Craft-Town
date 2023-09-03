package cn.mrcraftteammc.mrscrafttown.block.blockentity.blockentities.containers;

import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class MrCTBarrelBlocks extends BarrelBlock {
    public MrCTBarrelBlocks(MapColor mapColor, NoteBlockInstrument noteBlockInstrument, float destroyTime, float explosionResistance, SoundType soundType) {
        super(BlockBehaviour.Properties.of().mapColor(mapColor).instrument(noteBlockInstrument).strength(destroyTime, explosionResistance).sound(soundType).requiresCorrectToolForDrops());
    }
}
