package cn.mrcraftteammc.mrscrafttown.item;

import cn.mrcraftteammc.mrscrafttown.item.items.caidan.ChenMouRenLou233Item;
import cn.mrcraftteammc.mrscrafttown.item.items.caidan.MrZmh5Item;
import cn.mrcraftteammc.mrscrafttown.item.tool.copper.CyanCopperIngot;
import cn.mrcraftteammc.mrscrafttown.item.tool.copper.YellowCopperIngot;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    // Vanilla MrCTItems
    // TODO: Fix Crash
    // TODO  Add Copper Item and 爬墙红石
    public static final RegistrySupplier<Item> CYAN_COPPER_ITEM = ITEMS.register("cyan_copper_ingot", CyanCopperIngot::new);
    public static final RegistrySupplier<Item> YELLOW_COPPER_ITEM = ITEMS.register("yellow_copper_ingot", YellowCopperIngot::new);

    // Load this.class
    public static void register() {
        MrCTBlockItems.register();
        MrCTFoods.register();
        MrCTToolMaterials.register();

        ITEMS.register();
    }
}
