package com.example.examplemod.item;

import net.minecraft.world.item.Item;

import static com.example.examplemod.creativetab.ExampleMiscCreativeTab.EXAMPLE_MISC_TAB;

public class ExampleItem extends Item {

    public ExampleItem() {
        super(new Item.Properties().stacksTo(64).tab(EXAMPLE_MISC_TAB));
    }
}
