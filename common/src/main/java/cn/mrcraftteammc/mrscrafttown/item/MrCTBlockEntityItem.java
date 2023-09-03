package cn.mrcraftteammc.mrscrafttown.item;

import cn.mrcraftteammc.mrscrafttown.block.MrCTBlockEntities;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;

import static cn.mrcraftteammc.mrscrafttown.item.MrCTBlockItems.BlockItem;

public class MrCTBlockEntityItem {
    public static final RegistrySupplier<Item> BOX_BLOCK_ITEM = BlockItem("box_block_item", MrCTBlockEntities.BOX_BLOCK);
    public static final RegistrySupplier<Item> LARGE_BOX_BLOCK_ITEM = BlockItem("large_box_block_item", MrCTBlockEntities.LARGE_BOX_BLOCK);
    public static final RegistrySupplier<Item> DRAWER_BLOCK_ITEM = BlockItem("drawer_block_item", MrCTBlockEntities.DRAWER_BLOCK);

    public static void register() {}
}
