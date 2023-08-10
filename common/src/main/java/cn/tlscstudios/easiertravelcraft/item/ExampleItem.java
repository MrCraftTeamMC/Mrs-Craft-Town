package cn.tlscstudios.easiertravelcraft.item;

import net.minecraft.world.item.Item;

import static cn.tlscstudios.easiertravelcraft.creativetab.EasierTravelCraftCreativeTab.EASIERTRAVELCRAFT_TAB;

public class ExampleItem extends Item {
    public ExampleItem(Item.Properties properties) {
        super(properties.stacksTo(64).tab(EASIERTRAVELCRAFT_TAB));
    }
}
