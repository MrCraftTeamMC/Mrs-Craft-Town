package cn.mrcraftteammc.mrscrafttown.item;

import cn.mrcraftteammc.mrscrafttown.item.tool.copper.*;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

import static cn.mrcraftteammc.mrscrafttown.item.MrCTItems.ITEMS;

public class MrCTToolMaterials {
    public static final RegistrySupplier<Item> CYAN_COPPER_AXE = ITEMS.register("cyan_copper_axe", CyanCopperAxe::new);
    public static final RegistrySupplier<Item> CYAN_COPPER_HOE = ITEMS.register("cyan_copper_hoe", CyanCopperHoe::new);
    public static final RegistrySupplier<Item> CYAN_COPPER_PICKAXE = ITEMS.register("cyan_copper_pickaxe", CyanCopperPickaxe::new);
    public static final RegistrySupplier<Item> CYAN_COPPER_SWORD = ITEMS.register("cyan_copper_sword", CyanCopperSword::new);
    public static final RegistrySupplier<Item> CYAN_COPPER_SHOVEL = ITEMS.register("cyan_copper_shovel", CyanCopperShovel::new);

    public static final RegistrySupplier<Item> YELLOW_COPPER_AXE = ITEMS.register("yellow_copper_axe", YellowCopperAxe::new);
    public static final RegistrySupplier<Item> YELLOW_COPPER_HOE = ITEMS.register("yellow_copper_hoe", YellowCopperHoe::new);
    public static final RegistrySupplier<Item> YELLOW_COPPER_PICKAXE = ITEMS.register("yellow_copper_pickaxe", YellowCopperPickaxe::new);
    public static final RegistrySupplier<Item> YELLOW_COPPER_SWORD = ITEMS.register("yellow_copper_sword", YellowCopperSword::new);
    public static final RegistrySupplier<Item> YELLOW_COPPER_SHOVEL = ITEMS.register("yellow_copper_shovel", YellowCopperShovel::new);

    // Load this.class
    public static void register() {}
}