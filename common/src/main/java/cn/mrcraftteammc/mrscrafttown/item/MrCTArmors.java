package cn.mrcraftteammc.mrscrafttown.item;

import cn.mrcraftteammc.mrscrafttown.item.armor.CyanCopperArmors;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

import static cn.mrcraftteammc.mrscrafttown.item.MrCTItems.ITEMS;

public class MrCTArmors {
    public static final RegistrySupplier<Item> CYAN_COPPER_HELMET = ITEMS.register("cyan_copper_helmet", () -> new CyanCopperArmors(ArmorItem.Type.HELMET));
    public static final RegistrySupplier<Item> CYAN_COPPER_CHESTPLATE = ITEMS.register("cyan_copper_chestplate", () -> new CyanCopperArmors(ArmorItem.Type.CHESTPLATE));
    public static final RegistrySupplier<Item> CYAN_COPPER_LEGGINGS = ITEMS.register("cyan_copper_leggings", () -> new CyanCopperArmors(ArmorItem.Type.LEGGINGS));
    public static final RegistrySupplier<Item> CYAN_COPPER_BOOTS = ITEMS.register("cyan_copper_boots", () -> new CyanCopperArmors(ArmorItem.Type.BOOTS));

    public static void register() {}
}
