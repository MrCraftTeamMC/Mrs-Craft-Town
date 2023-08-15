package cn.mrcraftteammc.mrscrafttown.item;

import cn.mrcraftteammc.mrscrafttown.block.MrCTBlocks;
import cn.mrcraftteammc.mrscrafttown.creativetab.MrCTCreativeTabs;
import cn.mrcraftteammc.mrscrafttown.item.custom.CommonItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static RegistrySupplier<Item> BlockItem(@NotNull String id, Supplier<Block> b) {
        return ITEMS.register(id, () -> new BlockItem(b.get(), new Item.Properties().arch$tab(MrCTCreativeTabs.BASE_TAB)));
    }

    // Vanilla MrCTItems
    // TODO: Fix Crash
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", CommonItem::new);
    public static final RegistrySupplier<Item> MR_ZMH5_ITEM = ITEMS.register("mr_zmh5_item", CommonItem::new);
    public static final RegistrySupplier<Item> CHEN_MOU_REN_ITEM = ITEMS.register("chen_mou_ren_item", CommonItem::new);

    public static final RegistrySupplier<Item> EXAMPLE_BLOCK_ITEM = BlockItem("example_block_item", MrCTBlocks.EXAMPLE_BLOCK);
    public static final RegistrySupplier<Item> CUSTOM_BLOCK_ITEM = BlockItem("custom_block_item", MrCTBlocks.CUSTOM_BLOCK);


    // Load this.class
    public static void register() {
        ITEMS.register();
    }
}
