package cn.mrcraftteammc.mrscrafttown.item;

import cn.mrcraftteammc.mrscrafttown.block.MrCTBlockEntities;
import cn.mrcraftteammc.mrscrafttown.block.MrCTBlocks;
import cn.mrcraftteammc.mrscrafttown.block.MrCTPoiBlocks;
import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static cn.mrcraftteammc.mrscrafttown.block.MrCTBlocks.BLOCKS;
import static cn.mrcraftteammc.mrscrafttown.item.MrCTItems.ITEMS;

public class MrCTBlockItems {
    public static RegistrySupplier<Item> BlockItem(@NotNull String id, Supplier<Block> b) {
        return ITEMS.register(id, () -> new BlockItem(b.get(), new Item.Properties().arch$tab(MrCTCreativeTabs.BASE_TAB)));
    }

    public static final RegistrySupplier<Item> MR_ZMH5_BLOCK_ITEM = BlockItem("mr_zmh5_block_item", MrCTBlocks.MR_ZMH5_BLOCK);
    public static final RegistrySupplier<Item> CHEN_MOU_REN_LOU233_BLOCK_ITEM = BlockItem("chen_mou_ren_lou_233_block_item", MrCTBlocks.CHEN_MOU_REN_LOU233_BLOCK);
    public static final RegistrySupplier<Item> MR_LIMR267_BLOCK_ITEM = BlockItem("mr_limr267_block_item", MrCTBlocks.MR_LIMR267_BLOCK);
    public static final RegistrySupplier<Item> LIAN_GUI_114_BA_BLOCK_ITEM = BlockItem("lian_gui_114_ba_block_item", MrCTBlocks.LIAN_GUI_114_BA_BLOCK);

    public static final RegistrySupplier<Item> EBONY_BLOCK_ITEM = BlockItem("ebony_block_item", MrCTBlocks.EBONY_BLOCK);
    public static final RegistrySupplier<Item> RESTONED_CRAFTING_TABLE_BLOCK_ITEM = BlockItem("restoned_crafting_table_block_item", MrCTPoiBlocks.RESTONED_CRAFTING_TABLE_BLOCK);
    
    // Load this.class
    public static void register() {}
}