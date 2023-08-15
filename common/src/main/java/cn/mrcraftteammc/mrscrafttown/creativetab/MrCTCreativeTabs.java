package cn.mrcraftteammc.mrscrafttown.creativetab;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

public class MrCTCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static RegistrySupplier<CreativeModeTab> creativeTab(@NotNull String id, @NotNull String name, Item item) {
        return TABS.register(id, () -> CreativeTabRegistry.create(Component.translatable(name), () -> new ItemStack(item)));
    }

    public static final RegistrySupplier<CreativeModeTab> BASE_TAB = creativeTab("mrctmod_base_tab","category.mrctmod_base_tab", Items.CRAFTING_TABLE);
}
