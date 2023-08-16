package cn.mrcraftteammc.mrscrafttown.item;

import cn.mrcraftteammc.mrscrafttown.item.items.copper.CyanCopperItem;
import cn.mrcraftteammc.mrscrafttown.item.items.copper.YellowCopperItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> CYAN_COPPER_ITEM = ITEMS.register("cyan_copper_item", CyanCopperItem::new);
    public static final RegistrySupplier<Item> YELLOW_COPPER_ITEM = ITEMS.register("yellow_copper_item", YellowCopperItem::new);

    public static void register() {
        MrCTBlockItems.register();
        MrCTFoods.register();
        MrCTToolMaterials.register();

        ITEMS.register();
    }
}
