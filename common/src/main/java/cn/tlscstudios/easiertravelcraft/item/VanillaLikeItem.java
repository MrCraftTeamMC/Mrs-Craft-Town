package cn.tlscstudios.easiertravelcraft.item;

import net.minecraft.world.item.Item;

import static cn.tlscstudios.easiertravelcraft.creativetab.EasierTravelCraftCreativeTab.EASIERTRAVELCRAFT_TAB;

@SuppressWarnings("all")
public class VanillaLikeItem extends Item {
    public VanillaLikeItem(Item.Properties properties) {
        super(properties.stacksTo(64).arch$tab(EASIERTRAVELCRAFT_TAB));
    }
}
