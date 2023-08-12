package cn.tlscstudios.easiertravelcraft.item;

import cn.tlscstudios.easiertravelcraft.creativetab.ETCCreativeTabs;
import net.minecraft.world.item.Item;

public class VanillaItemTemplate extends Item {
    public VanillaItemTemplate() {
        super(new Item.Properties().stacksTo(64).arch$tab(ETCCreativeTabs.BASE_TAB));
    }
}
