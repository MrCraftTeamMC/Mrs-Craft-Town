package cn.mrcraftteammc.mrscrafttown.item;

import cn.mrcraftteammc.mrscrafttown.item.items.caidan.BugStickItem;
import cn.mrcraftteammc.mrscrafttown.item.items.caidan.SusItem;
import cn.mrcraftteammc.mrscrafttown.item.items.copper.CyanCopperItem;
import cn.mrcraftteammc.mrscrafttown.item.items.copper.YellowCopperItem;
import cn.mrcraftteammc.mrscrafttown.item.items.diamond.DiamondShardItem;
import cn.mrcraftteammc.mrscrafttown.item.items.emerald.EmeraldShardItem;
import cn.mrcraftteammc.mrscrafttown.item.items.glass.GlassShardItem;
import cn.mrcraftteammc.mrscrafttown.item.items.lapislazuli.LapisLazuliShardItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> CYAN_COPPER_ITEM = ITEMS.register("cyan_copper_item", CyanCopperItem::new);
    public static final RegistrySupplier<Item> YELLOW_COPPER_ITEM = ITEMS.register("yellow_copper_item", YellowCopperItem::new);

    public static final RegistrySupplier<Item> DIAMOND_SHARD_ITEM = ITEMS.register("diamond_shard_item", DiamondShardItem::new);
    public static final RegistrySupplier<Item> EMERALD_SHARD_ITEM = ITEMS.register("emerald_shard_item", EmeraldShardItem::new);
    public static final RegistrySupplier<Item> LAPIS_LAZULI_SHARD_ITEM = ITEMS.register("lapis_lazuli_shard_item", LapisLazuliShardItem::new);
    public static final RegistrySupplier<Item> GLASS_SHARD_ITEM = ITEMS.register("glass_shard_item", GlassShardItem::new);

    public static final RegistrySupplier<Item> BUG_STICK_ITEM = ITEMS.register("bug_stick_item", BugStickItem::new);
    public static final RegistrySupplier<Item> SUS_ITEM = ITEMS.register("sus_item", SusItem::new);

    public static void register() {
        MrCTBlockItems.register();
        MrCTFoods.register();
        MrCTToolMaterials.register();

        ITEMS.register();
    }
}
