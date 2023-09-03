package cn.mrcraftteammc.mrscrafttown.block.blockentity.blockentities.containers;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class MrCTFurnaceBlocks extends FurnaceBlock {
    public MrCTFurnaceBlocks(MapColor mapColor, NoteBlockInstrument instrument, float destroyTime, float explosionResistance, SoundType soundType, int lightValue) {
        super(BlockBehaviour.Properties.of().mapColor(mapColor).instrument(instrument).strength(destroyTime, explosionResistance).sound(soundType).ignitedByLava().requiresCorrectToolForDrops().lightLevel(Blocks.litBlockEmission(lightValue)));
    }
}
