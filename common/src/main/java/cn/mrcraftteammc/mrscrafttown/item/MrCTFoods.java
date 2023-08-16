package cn.mrcraftteammc.mrscrafttown.item;

import cn.mrcraftteammc.mrscrafttown.item.items.potato.ZippedPotatoItem;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;

import static cn.mrcraftteammc.mrscrafttown.item.MrCTItems.ITEMS;

public class MrCTFoods {
    public static final RegistrySupplier<Item> ZIPPED_POTATO_ITEM = ITEMS.register("zipped_potato", ZippedPotatoItem::new);

    // Load this.class
    public static void register() {}
}
