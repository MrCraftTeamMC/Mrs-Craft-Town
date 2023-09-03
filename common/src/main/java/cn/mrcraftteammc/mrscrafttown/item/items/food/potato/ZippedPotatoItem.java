package cn.mrcraftteammc.mrscrafttown.item.items.food.potato;

import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import net.minecraft.world.item.Item;

import static cn.mrcraftteammc.mrscrafttown.item.items.food.MrCTFoodProperties.ZIPPED_POTATO_PROPERTIES;

public class ZippedPotatoItem extends Item {
    public ZippedPotatoItem() {
        super(new Item.Properties().stacksTo(64).food(ZIPPED_POTATO_PROPERTIES).arch$tab(MrCTCreativeTabs.BASE_TAB));
    }
}
