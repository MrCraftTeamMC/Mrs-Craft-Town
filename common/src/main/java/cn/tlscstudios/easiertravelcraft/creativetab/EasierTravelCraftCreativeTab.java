package cn.tlscstudios.easiertravelcraft.creativetab;

import cn.tlscstudios.easiertravelcraft.item.RegisterItems;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod.MOD_ID;

public class EasierTravelCraftCreativeTab {
    public static final CreativeModeTab EASIERTRAVELCRAFT_TAB = CreativeTabRegistry.create(
            new ResourceLocation(MOD_ID, "easiertravelcraft_tab"),
            () -> new ItemStack(RegisterItems.EXAMPLE_ITEM.get())
    );
}
