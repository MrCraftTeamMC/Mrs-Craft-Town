package cn.mrcraftteammc.mrscrafttown.item;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    //public static final RegistrySupplier<Item> ZIPPED_POTATO_ITEM = ITEMS.register("zipped_potato_item", ZippedPotatoItem::new);

    public static void register() {
        MrCTBlockItems.register();
        MrCTFoods.register();
        MrCTToolMaterials.register();

        ITEMS.register();
    }
}
