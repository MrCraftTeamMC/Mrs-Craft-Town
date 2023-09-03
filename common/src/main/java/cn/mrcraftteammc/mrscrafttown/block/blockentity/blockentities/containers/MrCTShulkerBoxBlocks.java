package cn.mrcraftteammc.mrscrafttown.block.blockentity.blockentities.containers;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import org.jetbrains.annotations.Nullable;

public class MrCTShulkerBoxBlocks extends ShulkerBoxBlock {
    public MrCTShulkerBoxBlocks(@Nullable DyeColor dyeColor, MapColor mapColor, NoteBlockInstrument noteBlockInstrument, float destroyTime, float explosionResistance, SoundType soundType) {
        super(dyeColor, BlockBehaviour.Properties.of().mapColor(mapColor).instrument(noteBlockInstrument).strength(destroyTime, explosionResistance).sound(soundType).requiresCorrectToolForDrops());
    }
}
