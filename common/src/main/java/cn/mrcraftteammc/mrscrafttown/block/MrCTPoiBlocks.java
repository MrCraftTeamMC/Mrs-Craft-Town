package cn.mrcraftteammc.mrscrafttown.block;

import cn.mrcraftteammc.mrscrafttown.block.blocks.poi.ReStonedCraftingTable;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.level.block.Block;

import static cn.mrcraftteammc.mrscrafttown.block.MrCTBlocks.BLOCKS;

public class MrCTPoiBlocks {
    public static final RegistrySupplier<Block> RESTONED_CRAFTING_TABLE_BLOCK = BLOCKS.register("restoned_crafting_table_block", ReStonedCraftingTable::new);

    public static void register() {}
}
