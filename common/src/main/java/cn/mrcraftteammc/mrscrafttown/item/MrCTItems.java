package cn.mrcraftteammc.mrscrafttown.item;

import cn.mrcraftteammc.mrscrafttown.item.items.MrCTBaseItems;
import cn.mrcraftteammc.mrscrafttown.item.items.caidan.BugStickItem;
import cn.mrcraftteammc.mrscrafttown.item.items.caidan.SusItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> CYAN_COPPER_ITEM = ITEMS.register("cyan_copper_item", () -> new MrCTBaseItems(64, Rarity.COMMON));
    public static final RegistrySupplier<Item> YELLOW_COPPER_ITEM = ITEMS.register("yellow_copper_item", () -> new MrCTBaseItems(64, Rarity.COMMON));

    // Like This <? extends MrCTBaseItems>
    public static final RegistrySupplier<Item> DIAMOND_SHARD_ITEM = ITEMS.register("diamond_shard_item", () -> new MrCTBaseItems(64, Rarity.COMMON));

    public static final RegistrySupplier<Item> BUG_STICK_ITEM = ITEMS.register("bug_stick_item", BugStickItem::new);
    public static final RegistrySupplier<Item> SUS_ITEM = ITEMS.register("sus_item", SusItem::new);

    public static void register() {
        MrCTBlockEntityItem.register();
        MrCTBlockItems.register();
        MrCTFoods.register();
        MrCTArmors.register();
        MrCTTools.register();
        MrCTMiscItems.register();

        ITEMS.register();
    }
}
