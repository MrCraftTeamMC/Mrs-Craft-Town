package cn.mrcraftteammc.mrscrafttown.item;

import cn.mrcraftteammc.mrscrafttown.item.material.MrCTTiers;
import cn.mrcraftteammc.mrscrafttown.item.tool.*;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;

import static cn.mrcraftteammc.mrscrafttown.item.MrCTItems.ITEMS;

public class MrCTTools {
    public static final RegistrySupplier<Item> CYAN_COPPER_AXE = ITEMS.register("cyan_copper_axe", () -> new MrCTBaseAxes(MrCTTiers.CYAN_COPPER, 7.0f, -3.2f, 500));
    public static final RegistrySupplier<Item> CYAN_COPPER_HOE = ITEMS.register("cyan_copper_hoe", () -> new MrCTBaseHoes(MrCTTiers.CYAN_COPPER, -1, -2.0f, 500));
    public static final RegistrySupplier<Item> CYAN_COPPER_PICKAXE = ITEMS.register("cyan_copper_pickaxe", () -> new MrCTBasePickaxes(MrCTTiers.CYAN_COPPER, 1, -2.8f, 500));
    public static final RegistrySupplier<Item> CYAN_COPPER_SWORD = ITEMS.register("cyan_copper_sword", () -> new MrCTBaseSwords(MrCTTiers.CYAN_COPPER, 3, -2.4f, 500));
    public static final RegistrySupplier<Item> CYAN_COPPER_SHOVEL = ITEMS.register("cyan_copper_shovel", () -> new MrCTBaseShovels(MrCTTiers.CYAN_COPPER, 1.5f, -3.0f, 500));

    public static final RegistrySupplier<Item> YELLOW_COPPER_AXE = ITEMS.register("yellow_copper_axe", () -> new MrCTBaseAxes(MrCTTiers.YELLOW_COPPER, 6.1f, -1.5f, 350));
    public static final RegistrySupplier<Item> YELLOW_COPPER_HOE = ITEMS.register("yellow_copper_hoe", () -> new MrCTBaseHoes(MrCTTiers.YELLOW_COPPER, -2, -1.3f, 350));
    public static final RegistrySupplier<Item> YELLOW_COPPER_PICKAXE = ITEMS.register("yellow_copper_pickaxe", () -> new MrCTBasePickaxes(MrCTTiers.YELLOW_COPPER, 1, -2.3f, 350));
    public static final RegistrySupplier<Item> YELLOW_COPPER_SWORD = ITEMS.register("yellow_copper_sword", () -> new MrCTBaseSwords(MrCTTiers.YELLOW_COPPER, 2, -1.9f, 350));
    public static final RegistrySupplier<Item> YELLOW_COPPER_SHOVEL = ITEMS.register("yellow_copper_shovel", () -> new MrCTBaseShovels(MrCTTiers.YELLOW_COPPER, 1.1f, -2.2f, 350));

    // Load this.class
    public static void register() {}
}