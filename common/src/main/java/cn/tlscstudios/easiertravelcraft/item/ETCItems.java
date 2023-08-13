package cn.tlscstudios.easiertravelcraft.item;

import cn.tlscstudios.easiertravelcraft.block.ETCBlocks;
import cn.tlscstudios.easiertravelcraft.creativetab.ETCCreativeTabs;
import cn.tlscstudios.easiertravelcraft.item.custom.CommonItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod.MOD_ID;

public class ETCItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
    public static RegistrySupplier<Item> BlockItem(@NotNull String id, Supplier<Block> b) {
        return ITEMS.register(id, () -> new BlockItem(b.get(), new Item.Properties().tab(ETCCreativeTabs.BASE_TAB)));
    }

    // Vanilla ETCItems
    // TODO: Fix Crash
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", CommonItem::new);
    public static final RegistrySupplier<Item> MR_ZMH5_ITEM = ITEMS.register("mr_zmh5_item", CommonItem::new);
    public static final RegistrySupplier<Item> CHEN_MOU_REN_ITEM = ITEMS.register("chen_mou_ren_item", CommonItem::new);

    public static final RegistrySupplier<Item> EXAMPLE_BLOCK_ITEM = BlockItem("example_block_item", ETCBlocks.EXAMPLE_BLOCK);
    public static final RegistrySupplier<Item> CUSTOM_BLOCK_ITE  = BlockItem("custom_block_item", ETCBlocks.CUSTOM_BLOCK);

    // Load this.class
    public static void register() {
        ITEMS.register();
    }
}
