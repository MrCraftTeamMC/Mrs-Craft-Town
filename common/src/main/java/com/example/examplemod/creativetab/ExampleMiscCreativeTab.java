package com.example.examplemod.creativetab;

import com.example.examplemod.item.RegisterItems;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.example.examplemod.ExampleMod.MOD_ID;

public class ExampleMiscCreativeTab {
    public static final CreativeModeTab EXAMPLE_MISC_TAB = CreativeTabRegistry.create(
            new ResourceLocation(MOD_ID, "example_misc_tab"),
            () -> new ItemStack(RegisterItems.EXAMPLE_ITEM.get())
    );
}
