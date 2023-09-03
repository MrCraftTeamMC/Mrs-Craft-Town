package cn.mrcraftteammc.mrscrafttown.block;

import cn.mrcraftteammc.mrscrafttown.block.blockentity.blockentities.containers.BoxBlocks;
import cn.mrcraftteammc.mrscrafttown.block.blockentity.blockentities.containers.DrawerBlocks;
import cn.mrcraftteammc.mrscrafttown.block.blockentity.blockentities.containers.LargeBoxBlocks;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.level.block.Block;

import static cn.mrcraftteammc.mrscrafttown.block.MrCTBlocks.BLOCKS;

public class MrCTBlockEntities {
    public static final RegistrySupplier<Block> BOX_BLOCK = BLOCKS.register("box_block", BoxBlocks::new);
    public static final RegistrySupplier<Block> LARGE_BOX_BLOCK = BLOCKS.register("large_box_block", LargeBoxBlocks::new);
    public static final RegistrySupplier<Block> DRAWER_BLOCK = BLOCKS.register("drawer_block", DrawerBlocks::new);

    //public static final RegistrySupplier<Block> DIRT_CHEST_BLOCK = BLOCKS.register("dirt_chest_block", () -> new MrCTChestBlocks(MapColor.DIRT, NoteBlockInstrument.BELL, 5.0f, 6.0f, SoundType.METAL));

    //public static final RegistrySupplier<Block> DIRT_FURNACE_BLOCK = BLOCKS.register("dirt_furnace_block", () -> new MrCTFurnaceBlocks(MapColor.DIRT, NoteBlockInstrument.BELL, 5.0f, 6.0f, SoundType.METAL, 13));

    public static void register() {}
}
