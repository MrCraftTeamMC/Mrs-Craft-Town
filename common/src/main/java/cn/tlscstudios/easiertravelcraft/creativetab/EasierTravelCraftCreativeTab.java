package cn.tlscstudios.easiertravelcraft.creativetab;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import static cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod.MOD_ID;

public class EasierTravelCraftCreativeTab {
    public static final CreativeTabRegistry.TabSupplier EASIERTRAVELCRAFT_TAB = CreativeTabRegistry.create(
            new ResourceLocation(MOD_ID, "easiertravelcraft_tab"), // Tab ID
            () -> new ItemStack(Items.CRAFTING_TABLE) // Icon
    );
}
