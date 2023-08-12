package cn.tlscstudios.easiertravelcraft.item.custom;

import cn.tlscstudios.easiertravelcraft.creativetab.ETCCreativeTabs;
import net.minecraft.world.item.Item;

public class CommonItem extends Item {

    public CommonItem() {
        super(new Item.Properties()
                .stacksTo(64)
                .arch$tab(ETCCreativeTabs.BASE_TAB));
    }
}
