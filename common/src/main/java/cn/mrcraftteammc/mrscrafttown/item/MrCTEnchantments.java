package cn.mrcraftteammc.mrscrafttown.item;

import cn.mrcraftteammc.mrscrafttown.item.enchantment.FragileEnchantment;
import cn.mrcraftteammc.mrscrafttown.item.enchantment.FrostEnchantment;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.Enchantment;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(MOD_ID, Registries.ENCHANTMENT);

    public static final RegistrySupplier<Enchantment> FRAGILE_ENCHANTMENT = ENCHANTMENTS.register("fragile_enchantment", FragileEnchantment::new);
    public static final RegistrySupplier<Enchantment> FROST_ENCHANTMENT = ENCHANTMENTS.register("frost_enchantment", FrostEnchantment::new);

    public static void register() {
        ENCHANTMENTS.register();
    }
}
