package cn.tlscstudios.easiertravelcraft.creativetab;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import static cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod.MOD_ID;

public class ETCCreativeTabs {
    public static final CreativeModeTab BASE_TAB = CreativeTabRegistry.create(
            new ResourceLocation(MOD_ID, "easiertravelcraft_tab"), // Tab ID
            () -> new ItemStack(Items.CRAFTING_TABLE) // Icon
    );

    public static void register() {}
}
